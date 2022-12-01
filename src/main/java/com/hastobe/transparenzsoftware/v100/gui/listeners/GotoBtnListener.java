package com.hastobe.transparenzsoftware.v100.gui.listeners;

import com.hastobe.transparenzsoftware.v100.gui.views.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listener to go to the next or previous page of values
 */
public class GotoBtnListener implements ActionListener {

    private MainView mainView;
    private final Direction direction;

    public GotoBtnListener(MainView mainView, Direction direction) {
        this.mainView = mainView;
        this.direction = direction;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        mainView.onGoto(direction);
    }

    public enum Direction {
        NEXT,
        PREVIOUS,
        LAST,
        FIRST
    }
}
