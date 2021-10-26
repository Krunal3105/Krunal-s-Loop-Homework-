package Homework12;

public class DoWhileLoopOddEven {
    public static void main(String[] args) {
        System.out.println("Odd Numbers;");
        int odd= 1;
        do {
            System.out.println(odd++);
            odd++;
        } while (odd < 20);
        System.out.println("Even Numbers;");
        int even= 2;
        do {
            System.out.println(even++);
            even++;
        }while (even<=20);
        }
    }

