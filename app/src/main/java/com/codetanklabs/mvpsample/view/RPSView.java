package com.codetanklabs.mvpsample.view;

import com.codetanklabs.mvpsample.model.GameState;
import com.codetanklabs.mvpsample.model.Hand;

public interface RPSView {

    void showWinner(GameState gameState);
    void clearWinnerDisplay();
    void clearButtons();
    void setAndroidHand(Hand hand);

}
