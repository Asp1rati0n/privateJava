package JavaSE.JavaStudy.JavaGUI.AWTPaint.Demo03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainDemo03 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setTitle("Java GUI Demo03");
        frame.setSize(500, 500);
        frame.setResizable(true);
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(null);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setLayout(null);
        frame.setFont(new Font("宋体", Font.BOLD, 15));

        TextField textField = new TextField();
        textField.setBounds(20, 50, 200, 25);
        // 文本展示替换
        // textField.setEchoChar('*');
        frame.add(textField);

        Checkbox checkbox = new Checkbox("Remember me");
        checkbox.setBounds(20, 80, 150, 20);
        frame.add(checkbox);

        // 文本域
        TextArea textArea = new TextArea();
        textArea.setBounds(20, 110, 200, 200);
        // frame.add(textArea);

        CheckboxGroup group = new CheckboxGroup();

        Checkbox c1 = new Checkbox("A");
        c1.setBounds(20, 110, 100, 30);
        // frame.add(c1);

        Checkbox c2 = new Checkbox("B");
        c2.setBounds(20, 150, 100, 30);
        // frame.add(c2);

        Checkbox c3 = new Checkbox("B");
        c3.setBounds(20, 190, 100, 30);
        // frame.add(c3);

        c1.setCheckboxGroup(group);
        c2.setCheckboxGroup(group);
        c3.setCheckboxGroup(group);


        Button button = new Button("Button");
        button.setBounds(20, 320, 100, 30);
        button.addActionListener(e -> {
            // System.out.println(new Date(e.getWhen()) + " Attack Success!");
            String info = textField.getText();
            String text = textArea.getText();
            System.out.println("Info: " + info);
            System.out.println("Text:\n" + text);
            System.out.println(checkbox.getState());
            // System.out.println(group.getSelectedCheckbox().getLabel());
        });
        frame.add(button);





        frame.setVisible(true);
    }
}
