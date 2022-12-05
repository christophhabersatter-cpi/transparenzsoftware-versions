package com.hastobe.transparenzsoftware.v110.gui.listeners;

import com.hastobe.transparenzsoftware.v110.gui.views.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listener to open the about page
 */
public class AboutBtnListener implements ActionListener {

    private MainView mainView;

    public AboutBtnListener(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        mainView.onAboutOpen();
    }
}
