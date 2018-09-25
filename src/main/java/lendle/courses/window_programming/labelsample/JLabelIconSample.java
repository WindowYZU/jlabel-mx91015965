/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.window_programming.labelsample;

import java.awt.FlowLayout;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class JLabelIconSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("User");

        JTextField textField = new JTextField(20);
        //1. 利用 url 建立 ImageIcon
        //2. 取得 scaled instance
        //3. 設定到 label1
        //ImageIcon icon=new ImageIcon(new URL());
        //Icon icon2=new ImageIcon(icon.getImage().getScaledInstance());
        
        ////////////////////////////
     
        frame.add(label1);
        frame.add(textField);
        frame.setSize(800, 500);
        frame.setVisible(true);

    }
    
}
