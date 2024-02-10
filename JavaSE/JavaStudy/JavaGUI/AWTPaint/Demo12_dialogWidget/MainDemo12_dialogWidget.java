package JavaSE.JavaStudy.JavaGUI.AWTPaint.Demo12_dialogWidget;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainDemo12_dialogWidget {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(500, 500, 500, 300);
        // frame.setAlwaysOnTop(true);

        // 创建对话框
//        Dialog dialog = new Dialog(frame, "Dialog", true);
//        dialog.setSize(200, 80);
//        dialog.setResizable(true);
//        dialog.add(new Label("Do you want to Exit?"), BorderLayout.NORTH);
//        dialog.add(new Button("Yes"), BorderLayout.WEST);
//        dialog.add(new Button("Cancel"), BorderLayout.EAST);
//
//        dialog.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                // dialog.setVisible(false);
//                dialog.dispose();
//            }
//        });

        // 文件对话框
        FileDialog fileDialog = new FileDialog(frame, "Choose file", FileDialog.LOAD);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // frame.dispose();
                // dialog.setVisible(true);
                fileDialog.setVisible(true);
                // System.out.println("File Info:" + fileDialog.getDirectory() + fileDialog.getFile());
                System.out.println("File Name:" + fileDialog.getFile());
            }
        });

        frame.setVisible(true);
    }
}
