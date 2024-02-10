package JavaSE.JavaStudy.JavaGUI.AWTPaint.Demo14_windowDecorate;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.RoundRectangle2D;

public class MainDemo14_windowDecorate {
    public static void main(String[] args) {
        Frame frame = new Frame("Java GUI") {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(0, 0, getWidth(), 28);
                g.setColor(Color.BLACK);
                g.drawString(getTitle(), getWidth() / 2, 20);
                // 保留原本的绘制窗口
                super.paint(g);
            }
        };
        frame.setBounds(500, 500, 500, 300);
        frame.setAlwaysOnTop(true);

        // 设置窗口是否可以被操作系统修饰
        frame.setUndecorated(true);

//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                frame.dispose();
//            }
//        });

        frame.setShape(new RoundRectangle2D.Double(0, 0, frame.getWidth(), frame.getHeight(), 30, 30));

        // 鼠标拖动窗口
        frame.addMouseMotionListener(new MouseMotionAdapter() {
            int oldX, oldY;
            public void mouseDragged(MouseEvent e) {
                if (e.getY() <= 28) {
                    frame.setLocation(e.getXOnScreen() - oldX, e.getYOnScreen() - oldY);
                }
            }

            public void mouseMoved(MouseEvent e) {
                oldX = e.getX();
                oldY = e.getY();
            }
        });


        frame.setVisible(true);
    }
}
