package JavaSE.JavaStudy.JavaGUI.AWTPaint.Demo13_defineWidget;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public class MainDemo13_defineWidget {
    public static void main(String[] args) throws IOException {
        Frame frame = new Frame();
        frame.setBounds(500, 500, 500, 300);
        String filename = "F:\\Code\\Java\\JavaStudy\\JavaGUI\\Demo13_defineWidget\\04.jpg";
        frame.setIconImage(ImageIO.read(new File(filename)));
        // frame.setLayout(null);

        ImageView imageView = new ImageView(filename);
        // imageView.setBounds(20, 50, 100, 50);
        frame.add(imageView);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });


        frame.setVisible(true);
    }
}
