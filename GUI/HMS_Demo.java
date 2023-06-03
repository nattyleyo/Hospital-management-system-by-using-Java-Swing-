package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mta
 */
public class HMS_Demo {
    private static JFrame jframe;
    public static void main(String[] args) throws Exception{
        jframe=new JFrame();
        LoginPanel Ad_panel=new LoginPanel ();
        switchPanel(Ad_panel);
        jframe.setSize(Ad_panel.getPreferredSize());
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   public static void switchPanel(JPanel jpanel){
       jframe.setContentPane(jpanel);
       jframe.setSize(jpanel.getPreferredSize());
       jframe.setLocationRelativeTo(null);
       jframe.setResizable(false);
       jframe.setVisible(true);
       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   public static void sizeFrame(int width,int height){
        jframe.setSize(width,height);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
