package JavaSE.JavaStudy.JavaGUI.AWTPaint.Demo08_scrollPanel;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainDemo08_scrollPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(500, 500, 500, 300);
        frame.setAlwaysOnTop(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // 滚动面板
        ScrollPane scrollPane = new ScrollPane();
        frame.add(scrollPane);

        GridLayout gridLayout = new GridLayout();
        gridLayout.setRows(20);
        Panel panel = new Panel();
        panel.setLayout(gridLayout);
        for (int i = 1; i < 21; i++) {
            Button button = new Button("Button " + i);
            // 设置按钮首选大小
            button.setPreferredSize(new Dimension(100, 50));
            panel.add(button);
        }
        scrollPane.add(panel);



        frame.setVisible(true);
    }
}
