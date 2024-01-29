//package lesson6;
//
//public class CalculatorHW {
//    public static void main(String[] args) {
//        String expression = "38+8";
//        String n1 = "";
//        String n2 = "";
//        String s = "";
//        boolean error = false;
//        int p = 0;
//        while (p < expression.length()) {
//            char ch = expression.charAt(p);
//            switch (ch) {
//                case '0','1','2','3','4','5','6','7','8','9':
//                    if (s.isEmpty()) {
//                        n1 += ch;
//                    } else {
//                        n2 += ch;
//                    }
//                    break;
//                case '+','-','*','/':
//                    s += ch;
//                    break;
//                case ' ':
//                    break;
//                default:
//                    error = true;
//            }
//            if (error) {
//                System.out.println("Error in expression");
//            } else {
//                int n1value = Integer.valueOf(n1);
//                int n2value = Integer.valueOf(n1);
//                switch (s) {
//                    case "+":
//                        System.out.println(n1 + s + n2 + " = " + (n1value + n2value));
//                    case "-":
//                        System.out.println(n1 + s + n2 + " = " + (n1value + n2value));
//                        break;
//                    case "*":
//                        System.out.println(n1 + s + n2 + " = " + (n1value + n2value));
//                        break;
//                    case "/":
//                        System.out.println(n1 + s + n2 + " = " + (n1value + n2value));
//                        break;
//                }
//            }
//        }
//    }
//}
