/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.window_programming.labelsample;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class JLabelMnemonicSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("User");
        JLabel label2 = new JLabel("Password");
        //設定 label1 和 label2 的 displayed mnemonic
        label1.setDisplayedMnemonic('U');
        label2.setDisplayedMnemonic('P');
        ////////////////////////////////////////////
        JTextField textField = new JTextField(20);
        JTextField textField1 = new JTextField(20);
        
        //設定 label1 和 label2 的 labelfor
        label1.setLabelFor(textField);
        label2.setLabelFor(textField1);
        //////////////////////////////////
        frame.add(label1);
        frame.add(textField);
        frame.add(label2);
        frame.add(textField1);
        frame.setSize(800, 500);
        frame.setVisible(true);

    }

}
