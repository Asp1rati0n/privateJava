package JavaSE.JavaStudy.JavaGUI.AWTPaint.Demo06_cardLayout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainDemo06_cardLayout {
    public static void main(String[] args) throws InterruptedException {
        Frame frame = new Frame();
        frame.setBounds(500, 500, 500, 300);
        frame.setAlwaysOnTop(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // frame.dispose();
                System.exit(0);
            }
        });

        // 卡片布局
//        CardLayout layout = new CardLayout();
//        frame.setLayout(layout);
//        frame.add(new Label("One"));
//        frame.add(new Label("Two"));

        GridLayout layout = new GridLayout();
        frame.setLayout(layout);
        layout.setRows(3);
        for (int i = 1; i < 11; i++) {
            frame.add(new Button("Button " + i));
        }



        frame.setVisible(true);

//        while (true) {
//            Thread.sleep(3000);
//            layout.next(frame);
//        }

    }
}
