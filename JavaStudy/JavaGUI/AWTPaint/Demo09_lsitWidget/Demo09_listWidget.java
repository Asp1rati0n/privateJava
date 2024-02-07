package JavaStudy.JavaGUI.AWTPaint.Demo09_lsitWidget;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo09_listWidget {
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

        ScrollPane scrollPane = new ScrollPane();
        frame.add(scrollPane);

        // list 组件
        List list = new List();
        // 多选
        list.setMultipleMode(true);
        list.add("list 1");
        list.add("list 2");
        list.add("list 3");
        list.add("list 4");

        list.addItemListener(System.out::println);
        list.addItemListener(e -> {
            // System.out.println(e.getSource());
        });
        scrollPane.add(list);


        frame.setVisible(true);
    }
}
