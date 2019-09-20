package algorithm;

import java.util.Stack;
import java.util.regex.Pattern;

public class BaseballGame {

    public int calPoints(String[] ops) {
        Stack<Integer> scores = new Stack<>();


        for(int i = 0; i<ops.length; i++){
            // Integer
            if(isInteger(ops[i])){
                int a = Integer.parseInt(ops[i]);
                scores.push(a);
            }
            // "+"
            if(ops[i].equals("+")){
                int a = scores.pop();
                int b = scores.peek();
                scores.push(a);
                scores.push(a+b);
            }
            // "C";
            if(ops[i].equals("C")){
                scores.pop();
            }
            //"D"
            if(ops[i].equals("D")){
               int a = scores.peek();
               scores.push(a*2);
            }
        }

        int[] validPoints = new int[scores.size()];
        int size = scores.size();
        for(int i = 0; i < size; i++){
            validPoints[i] = scores.pop();
        }

        int sum =0;

        for(int i = 0; i < validPoints.length; i++){
            sum = sum + validPoints[i];
        }

        return sum;
    }

    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^-?[0-9]+");
        return pattern.matcher(str).matches();
    }

    public static void main(String[] args) {
        BaseballGame game = new BaseballGame();
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        int a = game.calPoints(ops);
        System.out.println(a);
    }
}
