package JavaStudy.JavaGUI.AWTPaint.Demo05_flowLayout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainDemo05_flowLayout {
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

        // 流式布局
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setHgap(50);
        flowLayout.setVgap(50);
        // 居左对齐(默认居中对齐)
        flowLayout.setAlignment(FlowLayout.LEFT);
        frame.setLayout(flowLayout);

        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));
        frame.add(new Button("Button 4"));
        frame.add(new Button("Button 5"));
        frame.add(new Button("Button 6"));
        frame.add(new Button("Button 7"));
        frame.add(new Button("Button 8"));
        frame.add(new Button("Button 9"));


        frame.setVisible(true);
    }
}
