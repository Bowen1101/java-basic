package algorithm;

import java.util.Scanner;

public class InputTwoSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input first num");
        int num1 = in.nextInt();
        System.out.println("Please input second num");
        int num2 = in.nextInt();
        System.out.println(num1 + "*" + num2 + "=" + num1*num2);
    }
}
