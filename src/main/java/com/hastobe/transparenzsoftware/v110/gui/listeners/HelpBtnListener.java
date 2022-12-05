package com.hastobe.transparenzsoftware.v110.gui.listeners;

import com.hastobe.transparenzsoftware.v110.gui.views.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Help button listener, which opens the help view
 */
public class HelpBtnListener implements ActionListener {

    private MainView mainView;

    public HelpBtnListener(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        mainView.onHelpOpen();
    }
}
