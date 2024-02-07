package JavaStudy.JavaGUI.myDevelop.myCalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainCalculator implements ActionListener {
    private JTextArea jTextArea;
    private String expression = "";
    private double result;
    private int errorFlag = 0;

    public static void main(String[] args) {
        MainCalculator main = new MainCalculator();
        main.paintFrame();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton source = (JButton) event.getSource();
        String buttonText = source.getText();
        // JOptionPane.showMessageDialog(this, source.getText() + "clicked");
        if (buttonText.equals("Reset")) {
            expression = "";
            jTextArea.setText(expression);
        }else if (buttonText.equals("Delete")) {
            if (expression.length() < 1) {
                JOptionPane.showMessageDialog(null, "Invalid Operation!", "WARNING", JOptionPane.WARNING_MESSAGE);
            } else {
                expression = expression.substring(0, expression.length() - 1);
                jTextArea.setText(expression);
            }
        } else if (buttonText.equals("=")) {
            // jTextArea.setText("=");
            result = Calculator(expression);
            if (errorFlag == 1) {
                errorFlag = 0;
                expression = "";
                jTextArea.setText(expression);
            } else {
                String strResult = String.valueOf(result).replace(".0", "");
                jTextArea.setText(expression + "=" + String.valueOf(strResult));
                // expression = String.valueOf(result);
                expression = "";
            }
        } else {
//            String currentText = jTextArea.getText();
//            jTextArea.setText(currentText + buttonText);
            expression += buttonText;
            jTextArea.setText(expression);
        }
    }

    public double Calculator(String expression) {
        System.out.println(expression);
        char[] charArray = expression.toCharArray();
        ArrayList<String> arrayList = new ArrayList<>(5);
        String originalString = "";
        StringBuilder stringBuilder = new StringBuilder(originalString);
        int flag = 0;
        for (int i = 0; i < charArray.length; i++) {
            flag = 0;
            if (charArray[i] >= '0' && charArray[i] <= '9') {
                int len = 0;
                flag = 1;
                while ((charArray[i + len] >= '0' && charArray[i + len] <= '9') || charArray[i + len] == '.') {
                    stringBuilder.append(charArray[i + len]);
                    len += 1;
                    if (i + len >= charArray.length) break;
                }
                i += len - 1;
            }
            if (flag == 0) arrayList.add(String.valueOf(charArray[i]));
            else arrayList.add(stringBuilder.toString());
            originalString = "";
            stringBuilder = new StringBuilder(originalString);
        }

        arrayList.remove("");

        int arrayListLength = 0;
        flag = 0;

        for (int i = 0; i < arrayList.size() - 1; i++) {
            arrayListLength += 1;
            // System.out.println(arrayList.get(i));
            if ("x÷".indexOf(arrayList.get(i)) != -1 && flag == 0) flag = 1;
            if (i + 1 >= arrayList.size() - 1) continue;
            if ("+-x÷".indexOf(arrayList.get(i)) != -1 && "+-x÷".indexOf(arrayList.get(i + 1)) != -1) {
                JOptionPane.showMessageDialog(null, "Invalid Equation!", "WARNING", JOptionPane.WARNING_MESSAGE);
                errorFlag = 1;
                return 0;
            }

            if ("+-x÷".indexOf(arrayList.get(0)) != -1 || "+-x÷".indexOf(arrayList.get(arrayList.size() - 1)) != -1) {
                JOptionPane.showMessageDialog(null, "Invalid Equation!", "WARNING", JOptionPane.WARNING_MESSAGE);
                errorFlag = 1;
                return 0;
            }
        }

        // System.out.println(arrayList.size());

        double number1, number2;
        // System.out.println("flag: " + flag);
        if (flag == 1) {
            // 利用栈进行加减乘除四则运算
            ArrayList<String> newArrayList = new ArrayList<>(5);
            for (int i = 0; i <= arrayListLength; i++) {
                if ("x÷".indexOf(arrayList.get(i)) == -1) {
                    newArrayList.add(arrayList.get(i));
                } else if ("x÷".indexOf(arrayList.get(i)) != -1) {
                    number1 = Double.parseDouble(newArrayList.get(newArrayList.size() - 1));
                    number2 = Double.parseDouble(arrayList.get(i + 1));
                    if ("x".indexOf(arrayList.get(i)) != -1) {
                        result = Multi(number1, number2);
                    } else {
                        if (number2 == 0) {
                            JOptionPane.showMessageDialog(null, "Invalid Value!", "WARNING", JOptionPane.WARNING_MESSAGE);
                            errorFlag = 1;
                            return 0;
                        }
                        result = Div(number1, number2);
                    }
                    newArrayList.set(newArrayList.size() - 1, String.valueOf(result));
                    i += 1;
                }
            }
            for (String s : newArrayList) {
                System.out.println(s);
            }
            result = Double.parseDouble(newArrayList.get(0));
            for (int i = 0; i < newArrayList.size(); i++) {
                if ("+-".indexOf(newArrayList.get(i)) != -1) {
                    String opt = newArrayList.get(i);
                    if (opt.equals("+")) {
                        result += Double.parseDouble(newArrayList.get(i + 1));
                    } else if (opt.equals("-")) {
                        result -= Double.parseDouble(newArrayList.get(i + 1));
                    }
                    i += 1;
                }
            }
            // System.out.println(result);
        } else {
            // System.out.println("Hello");
            // System.out.println(arrayList.get(0));
            result = Double.parseDouble(arrayList.get(0));
            // System.out.println(result);
            // System.out.println(arrayList.get(0));
            for (int i = 1; i < arrayList.size(); i++) {
                // System.out.println(arrayList.get(i));
                if ("+-".indexOf(arrayList.get(i)) != -1) {
                    String opt = arrayList.get(i);
                    if (opt.equals("+")) {
                        result += Double.parseDouble(arrayList.get(i + 1));
                    } else if (opt.equals("-")) {
                        result -= Double.parseDouble(arrayList.get(i + 1));
                    }
                    i += 1;
                }
            }
            // System.out.println(result);
        }
        return result;
    }

    public static double Multi(double m, double n) {
        return m * n;
    }
    public static double Div(double m, double n) {
        return m / n;
    }

    public void paintFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(500, 500, 400, 435);
        // jFrame.setAlwaysOnTop(true);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        int yStart = 150;
        jTextArea = new JTextArea();
        jTextArea.setBounds(0, 0, 500, yStart);
        Font textFont = new Font(Font.DIALOG, Font.PLAIN, 26);
        jTextArea.setFont(textFont);
        jFrame.add(jTextArea);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(0, yStart, 200, 50);
        resetButton.addActionListener(this);
        jFrame.add(resetButton);
        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(200, yStart, 100, 50);
        deleteButton.addActionListener(this);
        jFrame.add(deleteButton);


        JButton number7Button = new JButton("7");
        number7Button.setBounds(0, yStart + 50, 100, 50);
        number7Button.addActionListener(this);
        jFrame.add(number7Button);
        JButton number4Button = new JButton("4");
        number4Button.setBounds(0, yStart + 100, 100, 50);
        number4Button.addActionListener(this);
        jFrame.add(number4Button);
        JButton number1Button = new JButton("1");
        number1Button.setBounds(0, yStart + 150, 100, 50);
        number1Button.addActionListener(this);
        jFrame.add(number1Button);

        JButton number8Button = new JButton("8");
        number8Button.setBounds(100, yStart + 50, 100, 50);
        number8Button.addActionListener(this);
        jFrame.add(number8Button);
        JButton number5Button = new JButton("5");
        number5Button.setBounds(100, yStart + 100, 100, 50);
        number5Button.addActionListener(this);
        jFrame.add(number5Button);
        JButton number2Button = new JButton("2");
        number2Button.setBounds(100, yStart + 150, 100, 50);
        number2Button.addActionListener(this);
        jFrame.add(number2Button);

        JButton number9Button = new JButton("9");
        number9Button.setBounds(200, yStart + 50, 100, 50);
        number9Button.addActionListener(this);
        jFrame.add(number9Button);
        JButton number6Button = new JButton("6");
        number6Button.setBounds(200, yStart + 100, 100, 50);
        number6Button.addActionListener(this);
        jFrame.add(number6Button);
        JButton number3Button = new JButton("3");
        number3Button.setBounds(200, yStart + 150, 100, 50);
        number3Button.addActionListener(this);
        jFrame.add(number3Button);

        JButton divButton = new JButton("÷");
        divButton.setBounds(300, yStart, 100, 50);
        divButton.addActionListener(this);
        jFrame.add(divButton);
        JButton multiButton = new JButton("x");
        multiButton.setBounds(300, yStart + 50, 100, 50);
        multiButton.addActionListener(this);
        jFrame.add(multiButton);
        JButton SubButton = new JButton("-");
        SubButton.setBounds(300, yStart + 100, 100, 50);
        SubButton.addActionListener(this);
        jFrame.add(SubButton);
        JButton plusButton = new JButton("+");
        plusButton.setBounds(300, yStart + 150, 100, 50);
        plusButton.addActionListener(this);
        jFrame.add(plusButton);

        JButton number0Button = new JButton("0");
        number0Button.setBounds(0, yStart + 200, 200, 50);
        number0Button.addActionListener(this);
        jFrame.add(number0Button);
        JButton deciButton = new JButton(".");
        deciButton.setBounds(200, yStart + 200, 100, 50);
        deciButton.addActionListener(this);
        jFrame.add(deciButton);
        JButton equalToButton = new JButton("=");
        equalToButton.setBounds(300, yStart + 200, 100, 50);
        equalToButton.addActionListener(this);
        jFrame.add(equalToButton);


        jFrame.setVisible(true);
    }
}
