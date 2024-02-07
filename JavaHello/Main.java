package JavaHello;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        scanner.close();
        System.out.println(equation);
        char[] charArray = equation.toCharArray();
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
                System.out.println("Invalid Equation!");
                System.exit(0);
            }

            if ("+-x÷".indexOf(arrayList.get(0)) != -1 || "+-x÷".indexOf(arrayList.get(arrayList.size() - 1)) != -1) {
                System.out.println("Invalid Equation!");
                System.exit(0);
            }
        }

        // System.out.println(arrayList.size());

        double number1, number2;
        // System.out.println("flag: " + flag);
        if (flag == 1) {
            ArrayList<String> newArrayList = new ArrayList<>(5);
            for (int i = 0; i <= arrayListLength; i++) {
//                if (!arrayList.get(i).equals('+') && !arrayList.get(i).equals('-') && !arrayList.get(i).equals('x') && !arrayList.get(i).equals('÷')) {
//                    number1 = Integer.parseInt(arrayList.get(i));
//                }
                if ("x÷".indexOf(arrayList.get(i)) == -1) {
                    newArrayList.add(arrayList.get(i));
                    // newArrayList.add(arrayList.get(i));
                } else if ("x÷".indexOf(arrayList.get(i)) != -1) {
                    number1 = Double.parseDouble(newArrayList.get(newArrayList.size() - 1));
                    number2 = Double.parseDouble(arrayList.get(i + 1));
                    double result;
                    if ("x".indexOf(arrayList.get(i)) != -1) {
                        result = Multi(number1, number2);
                    } else {
                        if (number2 == 0) {
                            System.out.println("Invalid Value!");
                            System.exit(0);
                        }
                        result = Div(number1, number2);
                    }
                    newArrayList.set(newArrayList.size() - 1, String.valueOf(result));
                    i += 1;
                }
            }
//            for (String s : newArrayList) {
//                System.out.println(s);
//            }
            double result = Double.parseDouble(newArrayList.get(0));
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
            System.out.println(result);
        } else {
            // System.out.println("Hello");
            double result = Double.parseDouble(arrayList.get(0));
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
            System.out.println(result);
        }
    }

//        for (char c : charArray) {
//            // System.out.println(c);
//            if (c >= '0' && c <= '9') {
//                stringBuilder.append(c);
//            }
//        }

//        System.out.println(equation.getClass().getName());
//        int number = Integer.parseInt(equation);
//        System.out.println(Integer.valueOf(number).getClass().getName());


    // System.out.println(Plus(-5, 3));

    public static double Plus(double m, double n) {
        return m + n;
    }

    public static int Plus(int m, int n) {
        return (int) Plus((double) m, (double) n);
    }

    public static double Plus(double m, int n) {
        return Plus(m, (double) n);
    }

    public static double Plus(int m, double n) {
        return Plus((double) m, n);
    }



    public static double Sub(double m, double n) {
        return m + n;
    }

    public static double Sub(int m, int n) {
        return (int) Sub((double) m, (double) n);
    }

    public static double Sub(double m, int n) {
        return Sub(m, (double) n);
    }

    public static double Sub(int m, double n) {
        return Sub((double) m, n);
    }


    public static double Multi(double m, double n) {
        return m * n;
    }

    public static double Multi(int m, int n) {
        return (int) Multi((double) m, (double) n);
    }

    public static double Multi(double m, int n) {
        return Multi(m, (double) n);
    }

    public static double Multi(int m, double n) {
        return Multi((double) m, n);
    }


    public static double Div(double m, double n) {
        return m / n;
    }

    public static double Div(int m, int n) {
        return (int) Div((double) m, (double) n);
    }

    public static double Div(double m, int n) {
        return Div(m, (double) n);
    }

    public static double Div(int m, double n) {
        return Div((double) m, n);
    }
}
