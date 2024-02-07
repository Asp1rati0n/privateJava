package JavaStudy.JavaGUI.AWTPaint.Demo07_panelLayout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainDemo07_panelLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(500, 500, 500, 300);
        frame.setAlwaysOnTop(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                // System.exit(0);
            }
        });


        GridLayout gridLayout = new GridLayout();
        gridLayout.setRows(2);
        frame.setLayout(gridLayout);

        // 创建面板
        Panel panel1 = new Panel();
        panel1.setBackground(Color.PINK);
        panel1.setLayout(new FlowLayout());
        for (int i = 1; i < 6; i++) {
            panel1.add(new Button("Flow " + i));
        }

        Panel panel2 = new Panel();
        panel2.setBackground(Color.ORANGE);
        panel2.setLayout(new GridLayout());
        for (int i = 1; i < 6; i++) {
            panel2.add(new Button("grid " + i));
        }

        frame.add(panel1);
        frame.add(panel2);



        frame.setVisible(true);
    }
}
