package com.hastobe.transparenzsoftware.v100.gui.views.customelements;

import com.hastobe.transparenzsoftware.v100.gui.listeners.TextareaChangedListeners;
import com.hastobe.transparenzsoftware.v100.gui.views.MainView;

import javax.swing.*;

public class VerifyTextArea extends JTextArea {

    public VerifyTextArea(MainView mainView) {
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.getDocument().addDocumentListener(new TextareaChangedListeners(mainView));
    }
}
