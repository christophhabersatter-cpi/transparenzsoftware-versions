package com.hastobe.transparenzsoftware.v110.gui.views;

import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import com.hastobe.transparenzsoftware.v110.Utils;
import com.hastobe.transparenzsoftware.v110.i18n.Translator;


public class DetailDataView extends JScrollPane {
    private static final long serialVersionUID = 1L;

    private static final String TEXT_NO_DATA_PRESENT = "app.view.nodata";
    private static final String TEXT_NO_DATA_DETAILS = "app.view.nodata.details";
    
	private final JTextPane dataLabel;

    public DetailDataView(MainView mainView) {
        this.setName("wnd.details");
        JPanel pane = new JPanel();

        dataLabel = new JTextPane();
        dataLabel.setContentType("text/html");
        dataLabel.setBackground(null);
        dataLabel.setEditable(false);
        dataLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        dataLabel.setName("lbl.data");
        this.setViewportView(dataLabel);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.setAlignmentX(CENTER_ALIGNMENT);
        ///pack();
        validate();
        repaint();
        this.setAutoscrolls(true);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    }

    public void setAdditionalData(Map<String, Object> additionalVerificationData) {
        if (additionalVerificationData.isEmpty()) {
        	dataLabel.setText(Translator.get(TEXT_NO_DATA_DETAILS));
            return;
        }
        StringBuilder bd = new StringBuilder();
        String fontfamily = this.getFont().getFamily();
        bd.append("<html><body width=100% style=\"font-family: ")
                .append(fontfamily)
                .append("\"><table>");
        int count = 0;
        for (String s : additionalVerificationData.keySet()) {
            Object value = additionalVerificationData.get(s);
            if (!(value instanceof Map)) {
                String styleBg = "border-bottom: 1px dotted black;";
                if (count % 2 != 0) {
                    styleBg += "background-color: dark-grey;";
                }
                String addText = Utils.splitStringToGroups(value != null ? value.toString() : "", 70, "<br/>");
                bd.append(
                        String.format(
                                "<tr style=\"%s\"><td style=\"width: 180px;\">%s</td><td><p>%s</p></td></tr>",
                                styleBg,
                                s,
                                addText)
                );
                count++;
            }
        }
        bd.append("</table></body></html>");
        dataLabel.setText(bd.toString());
        this.doLayout();
        this.repaint();
        this.revalidate();
    }

	public void clearErrorMessage() {
    	dataLabel.setText(Translator.get(TEXT_NO_DATA_DETAILS));
	}
	
}
