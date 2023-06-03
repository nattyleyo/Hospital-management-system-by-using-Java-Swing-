
package GUI.CustomStyle;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import javax.swing.text.StyleConstants;

public class Panel extends JPanel {
    public Panel(){
    setOpaque(false);}

    /**
     * @param args the command line arguments
     */
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //  Paint Border
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        //  Border set 2 Pix
        super.paintComponent(grphcs);
    }
}
