package com.hastobe.transparenzsoftware.v110.gui.listeners;

import com.hastobe.transparenzsoftware.v110.gui.views.DataInputDialog;
import com.hastobe.transparenzsoftware.v110.gui.views.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listener which is called when user presses "Paste"
 */
public class ManualInputBtnListener implements ActionListener {

    private final MainView mainView;
    
    public ManualInputBtnListener(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
    	DataInputDialog d = new DataInputDialog(mainView);
    }
}
