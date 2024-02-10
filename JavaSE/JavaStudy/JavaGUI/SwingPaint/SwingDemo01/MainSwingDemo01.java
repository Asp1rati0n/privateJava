package JavaSE.JavaStudy.JavaGUI.SwingPaint.SwingDemo01;

import javax.swing.*;

public class MainSwingDemo01 {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Swing GUI Demo01");
        jframe.setBounds(500, 500, 500, 300);
        jframe.setLayout(null);

        // 默认关闭操作
        jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton jButton = new JButton("Button 1");
        // 组件的坐标原点并不是窗口的左上角, 而是标题栏下方的左上角
        jButton.setBounds(0, 0, 100, 30);
        jframe.add(jButton);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("Menu");
        JMenuItem jMenuItem1 = new JMenuItem("Option 1");
        jMenu.add(jMenuItem1);
        // 快捷键(alt + u)
        jMenuItem1.setAccelerator(KeyStroke.getKeyStroke('u'));
        jMenu.add(new JMenuItem("Option 2"));
        jMenuBar.add(jMenu);

        jframe.setJMenuBar(jMenuBar);

        jMenuItem1.addActionListener(e -> {
            System.out.println("shortcut");
        });

        jframe.setVisible(true);
    }
}
