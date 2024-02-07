package JavaStudy.JavaGUI.AWTPaint.Demo01;

import java.awt.*;
import java.awt.event.*;

public class MainDemo01 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setTitle("Java GUI Demo01");
        frame.setSize(500, 300);
        // frame.setBackground(Color.WHITE);
        // 设置窗口大小是否可以改变
        frame.setResizable(true);
        // 设置窗口是否始终展示在最前面
        frame.setAlwaysOnTop(true);
        // 调整窗口位置
        // frame.setLocation(800, 200);

        // 窗口居中(法1)
        // 获取屏幕尺寸
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        int x = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
//        int y = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);
//        frame.setLocation(x, y);
        // 窗口居中(法2)
        frame.setLocationRelativeTo(null);

        // 定义光标样式
        frame.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // 关闭窗口
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // 只关闭当前窗口(释放资源)
                frame.dispose();
                // 终止程序运行
                // System.exit(0);
            }
        });

        // 监听键盘
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
            }
        });

        // 监听鼠标点击
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 捕获鼠标点击的坐标位置
                // System.out.println(e.getX() + ", " + e.getY());
                System.out.println(e.getButton());
            }
        });

        // 监听鼠标滚动
        frame.addMouseWheelListener(e -> {
            System.out.println(e.getScrollAmount());
        });

        // 默认情况下窗口是不可见的
        frame.setVisible(true);
    }
}
