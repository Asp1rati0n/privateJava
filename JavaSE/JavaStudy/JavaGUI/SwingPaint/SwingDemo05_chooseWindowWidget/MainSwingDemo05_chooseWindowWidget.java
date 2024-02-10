package JavaSE.JavaStudy.JavaGUI.SwingPaint.SwingDemo05_chooseWindowWidget;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Optional;

public class MainSwingDemo05_chooseWindowWidget {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Java GUI Demo05");
        jFrame.setBounds(500, 500, 500, 500);
        // jFrame.setLayout(null);
        // jFrame.setAlwaysOnTop(true);

        jFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                // int value = JOptionPane.showConfirmDialog(jFrame, "do you want to exit?", "Ask", JOptionPane.YES_NO_OPTION);
//                int value = JOptionPane.showConfirmDialog(jFrame, "do you want to exit?", "enquire", JOptionPane.YES_NO_CANCEL_OPTION);
//                // System.out.println(value);
//                if (value == JOptionPane.OK_OPTION) {
//                    jFrame.dispose();
//                }
                // System.out.println(JOptionPane.showInputDialog("Please input text:"));
                JOptionPane.showMessageDialog(jFrame, "Exit Invalid");
            }
        });


        jFrame.setVisible(true);
    }
}
