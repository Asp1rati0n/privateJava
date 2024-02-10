package JavaSE.JavaStudy.JavaGUI.AWTPaint.Demo10_menuWidget;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainDemo10_menuWidget {
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

        // 菜单栏
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menu");
        MenuItem item1 = new MenuItem("Open File");
        MenuItem item2 = new MenuItem("Save File");
        MenuItem item3 = new MenuItem("Exit");
        // 设置可勾选的菜单栏选项
        CheckboxMenuItem item4 = new CheckboxMenuItem("Checkable Option");
        // 设置快捷键
        item4.setShortcut(new MenuShortcut('U', true));


        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menuBar.add(menu);
        frame.setMenuBar(menuBar);

        item1.addActionListener(e -> {
            System.out.println("Open File!");
        });

        item4.addItemListener(e -> {
            System.out.println("shortcut");
        });

        frame.setVisible(true);
    }
}
