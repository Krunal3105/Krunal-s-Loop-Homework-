package Homework12;

public class WhileLoopOddEven {
    public static void main(String args[]) {
        System.out.println("Below Numbers are Odd Numbers;");
        int i = 1;
        while (i < 20) {
            System.out.println(i++);
            i++;
        }


        System.out.println("Below Numbers are Even Numbers;");
        int j = 1;
        while (j <= 20) {
            System.out.println(++j);
            j++;
        }
    }
}
