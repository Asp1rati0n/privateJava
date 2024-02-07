package JavaStudy.JavaGUI.SwingPaint.SwingDemo02_progressBar;

import javax.swing.*;

public class MainSwingDemo02_progressBar {
    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Java GUI Demo02");
        jFrame.setBounds(500, 500, 500, 300);
        jFrame.setLayout(null);

        // jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 进度条
        JProgressBar jProgressBar = new JProgressBar();
        jProgressBar.setMaximum(100);
        // jProgressBar.setValue(50);
        // jProgressBar.setMinimum(0);
        jProgressBar.setBounds(20, 50, 100, 10);
        jFrame.add(jProgressBar);

        JButton jButton = new JButton("Start");
        jButton.setBounds(20, 100, 100, 30);



        jButton.addActionListener(event -> {
            new Thread(() -> {
                for (int i = 0; i <= 100; i += 2) {
                    jProgressBar.setValue(i);
                    jProgressBar.repaint();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        });

        jFrame.add(jButton);

        // 拷贝文件
//        JProgressBar jProgressBar = new JProgressBar();
//        jProgressBar.setMaximum(1000);
//        jProgressBar.setBounds(20, 50, 300, 10);
//        jFrame.add(jProgressBar);
//
//        JButton jButton = new JButton("Start");
//        jButton.setBounds(20, 100, 100, 30);
//        jButton.addActionListener(event -> {
//            new Thread(() -> {
//                File file = new File("F:\\File\\ISO\\kali-linux-2020.1b-live-amd64.iso");
//                try (FileInputStream fileInputStream = new FileInputStream("F:\\File\\ISO\\kali-linux-2020.1b-live-amd64.iso");
//                     FileOutputStream fileOutputStream = new FileOutputStream("F:\\File\\ISO\\kali_read.iso")){
//                    long size = file.length(), current = 0;
//                    int length;
//                    byte[] arr = new byte[512];
//                    while ((length = fileInputStream.read(arr)) > 0) {
//                        fileOutputStream.write(arr, 0, length);
//                        current += length;
//                        int value = (int) (current * 1000 / size);
//                        jProgressBar.setValue(value);
//                        jProgressBar.repaint();
//                    }
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }).start();
//        });
//        jFrame.add(jButton);

        jFrame.setVisible(true);
    }
}
