package com.hastobe.transparenzsoftware.v100.gui.views.customelements;

import com.hastobe.transparenzsoftware.v100.gui.Colors;
import com.hastobe.transparenzsoftware.v100.gui.views.ViewUtils;

import javax.swing.*;
import java.awt.*;

public class StyledButton extends JButton {

    public StyledButton(String s) {
        super(s);
        this.setForeground(Color.WHITE);
        this.setBackground(Colors.VERIFY_BUTTON);
        ViewUtils.makeButtonLookLikeLabel(this);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (evt.getComponent().isEnabled()) {
                    evt.getComponent().setBackground(Colors.VERIFY_BUTTON);
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!evt.getComponent().isEnabled()) {
                    evt.getComponent().setBackground(Colors.VERIFY_BUTTON_DISABLED);
                } else {
                    evt.getComponent().setBackground(Color.BLACK);
                }
            }
        });
    }
}
