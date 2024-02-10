package JavaSE.JavaStudy.JavaGUI.AWTPaint.Demo11_popMenu;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainDemo11_popMenu {
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

        // 弹出菜单
        PopupMenu popupMenu = new PopupMenu();
        popupMenu.add(new MenuItem("Option 1"));
        popupMenu.add(new MenuItem("Option 2"));
        frame.add(popupMenu);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    popupMenu.show(frame, e.getX(), e.getY());
                }
            }
        });


        frame.setVisible(true);
    }
}
