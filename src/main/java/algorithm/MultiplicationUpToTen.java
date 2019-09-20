package algorithm;

import java.util.Scanner;

public class MultiplicationUpToTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number:");
        int num1 = in.nextInt();

        for(int i = 1; i<=10 ; i++){
            System.out.println(num1 + "*" + i + "=" + num1*i);
        }
    }
}
