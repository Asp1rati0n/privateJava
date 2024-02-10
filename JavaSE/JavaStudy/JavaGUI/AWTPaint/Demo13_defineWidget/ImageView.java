package JavaSE.JavaStudy.JavaGUI.AWTPaint.Demo13_defineWidget;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageView extends Component {

    public Image image;

    public ImageView(String filename) {
        try (FileInputStream fileInputStream = new FileInputStream(filename)){
            image = ImageIO.read(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
//        g.setColor(Color.BLACK);
//        g.fillRect(0, 0, this.getWidth() / 2, this.getHeight());
//        g.setColor(Color.BLUE);
//        g.fillRect(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
//        g.setColor(Color.WHITE);
//        // 起始位置(原点/坐标轴原点)在左下角
//        g.drawString("Hello World!", 0, 20);

        // 绘制图片
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
    }
}
