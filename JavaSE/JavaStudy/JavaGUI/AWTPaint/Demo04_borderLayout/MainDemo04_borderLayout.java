package JavaSE.JavaStudy.JavaGUI.AWTPaint.Demo04_borderLayout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainDemo04_borderLayout {
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


        // 边界布局
        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);
        // 横向边距
        borderLayout.setHgap(50);
        // 纵向边距
        borderLayout.setVgap(50);

        frame.add(new Button("Button 1"), BorderLayout.WEST);
//        frame.add(new Button("Button 2"), BorderLayout.EAST);
//        frame.add(new Button("Button 3"), BorderLayout.SOUTH);
        frame.add(new Button("Button 4"), BorderLayout.NORTH);
        frame.add(new Button("Button 5"), BorderLayout.CENTER);


        Button button = new Button("Button");
        button.setSize(200, 300);
        // frame.add(button);



        frame.setVisible(true);
    }
}
