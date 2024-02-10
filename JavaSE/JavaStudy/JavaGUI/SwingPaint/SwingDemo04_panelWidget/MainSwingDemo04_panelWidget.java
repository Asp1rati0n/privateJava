package JavaSE.JavaStudy.JavaGUI.SwingPaint.SwingDemo04_panelWidget;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

public class MainSwingDemo04_panelWidget {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Java GUI Demo04");
        jFrame.setBounds(500, 500, 600, 500);
        // jFrame.setLayout(null);
        jFrame.setAlwaysOnTop(true);

        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // 多面板控件
//        JTabbedPane jTabbedPane = new JTabbedPane();
//        jTabbedPane.setBounds(0, 0, 500, 300);
//        jTabbedPane.addTab("Panel 1", new JPanel(){{setBackground(Color.ORANGE);}});
//        jTabbedPane.addTab("Panel 2", new JPanel(){{setBackground(Color.PINK);}});
//        jTabbedPane.addTab("Color Chooser", new JColorChooser());
//        jTabbedPane.addTab("File Chooser", new JFileChooser());
//        jFrame.add(jTabbedPane);

        JTextArea jTextArea = new JTextArea();

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
        jTree.addTreeSelectionListener(e -> {
            // 文本域置空
            jTextArea.setText("");
            try (FileReader fileReader = new FileReader("F:\\Code\\Java\\" + e.getPath().getLastPathComponent().toString())){
                char[] chars = new char[128];
                int len;
                while ((len = fileReader.read(chars)) > 0) {
                    jTextArea.setText(jTextArea.getText() + new String(chars, 0, len));
                }
            } catch (IOException err) {
                err.printStackTrace();
            }
        });

        // 分割面板
        JSplitPane jSplitPane = new JSplitPane();
        // jSplitPane.setLeftComponent(new JPanel(){{setBackground(Color.ORANGE);}});
        jSplitPane.setLeftComponent(new JScrollPane(jTree));
        // jSplitPane.setRightComponent(new JPanel(){{setBackground(Color.PINK);}});
        jSplitPane.setRightComponent(new JScrollPane(jTextArea));
        jFrame.add(jSplitPane);



        jFrame.setVisible(true);
    }
}
