package com.codetanklabs.mvpsample.presenter;

import com.codetanklabs.mvpsample.model.Game;
import com.codetanklabs.mvpsample.model.GameState;
import com.codetanklabs.mvpsample.model.Hand;
import com.codetanklabs.mvpsample.view.RPSView;

import java.util.Random;

public class RPSPresenter implements Presenter {

    private RPSView view;
    private Game model;
    private static final Random randomHand = new Random();

    public RPSPresenter(RPSView view) {
        this.view = view;
        this.model = new Game();
    }

    @Override
    public void onCreate() {
        model = new Game();
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void onHandSelected(Hand playerHand) {
        model.setHand(playerHand);
        Hand androidHand = Hand.values()[randomHand.nextInt(Hand.values().length)];

        view.setAndroidHand(androidHand);

        GameState state = model.getWinner(playerHand, androidHand);
        view.showWinner(state);
    }

    public void onResetSelected() {
        view.clearWinnerDisplay();
        view.clearButtons();
        model.restart();
    }


}
