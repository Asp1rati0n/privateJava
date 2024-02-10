package JavaSE.JavaStudy.JavaGUI.SwingPaint.SwingDemo03_switchWidget;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.util.Optional;

public class MainSwingDemo03_switchWidget {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Java GUI Demo03");
        jFrame.setBounds(500, 500, 600, 500);
        jFrame.setLayout(null);
        // jFrame.setAlwaysOnTop(true);

        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // 开关
//        JToggleButton jToggleButton = new JToggleButton("Switch");
//        jToggleButton.setBounds(10, 10, 100, 30);
//        // 开关默认是关闭的(下面设置默认打开)
//        jToggleButton.setSelected(true);
//        jFrame.add(jToggleButton);

        // 颜色选择器
//        JColorChooser jColorChooser = new JColorChooser();
//        jColorChooser.setBounds(0, 0, 600, 300);
//        jFrame.add(jColorChooser);

        // 文件选择器
//        JFileChooser jFileChooser = new JFileChooser();
//        jFileChooser.setBounds(0, 0, 500, 300);
//        jFrame.add(jFileChooser);

        // Button 组件功能提示
//        JButton jButton = new JButton("Button");
//        jButton.setBounds(50, 50, 100, 30);
//        jButton.setToolTipText("Tips");
//        jFrame.add(jButton);

        // 文件树
        File file = new File("F:\\Code\\Java");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(file.getName());
        // 遍历当前目录下所有文件和文件夹
        File[] files = Optional.ofNullable(file.listFiles()).orElseGet(() -> new File[0]);
        // 构造子结点并连接
        for (File f : files) {
            root.add(new DefaultMutableTreeNode(f.getName()));
        }

        JTree jTree = new JTree(root);
        jTree.setBounds(0, 0, 200, 300);
        jFrame.add(jTree);




        jFrame.setVisible(true);
    }
}
