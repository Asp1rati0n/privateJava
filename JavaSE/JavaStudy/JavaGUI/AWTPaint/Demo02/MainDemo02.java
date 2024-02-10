package JavaSE.JavaStudy.JavaGUI.AWTPaint.Demo02;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainDemo02 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setTitle("Java GUI Demo02");
        frame.setSize(500, 300);
        frame.setResizable(true);
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(null);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // 查看操作系统已安装的字体
//        for (Font allFont : GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts()) {
//            System.out.println(allFont);
//        }

        frame.setLayout(null);
        // frame.setFont(new Font("宋体", Font.BOLD, 15));
        Label label = new Label("Button");
        label.setBounds(20, 50, 100, 30);
        label.setFont(new Font("宋体", Font.BOLD, 15));
        // 字体颜色
        label.setForeground(Color.WHITE);
        label.setBackground(Color.BLACK);
        frame.add(label);


        frame.setVisible(true);
    }
}
