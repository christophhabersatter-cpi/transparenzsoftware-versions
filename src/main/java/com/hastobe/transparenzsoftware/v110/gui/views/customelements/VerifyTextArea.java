package com.hastobe.transparenzsoftware.v110.gui.views.customelements;

import com.hastobe.transparenzsoftware.v110.gui.listeners.TextareaChangedListeners;
import com.hastobe.transparenzsoftware.v110.gui.views.MainView;

import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.*;

public class VerifyTextArea extends JTextArea {

	public VerifyTextArea(MainView mainView, AtomicBoolean eventsEnabled) {
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.getDocument().addDocumentListener(new TextareaChangedListeners(mainView, eventsEnabled));
    }
}