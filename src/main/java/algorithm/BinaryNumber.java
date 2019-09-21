package algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumber {
    public static void add(long a, long b){
        long c = a+b;
        List<Long> result = new ArrayList<>();
        while(c != 0) {
            long num = c%10;
            c = c/10;
            result.add(0,num);
        }

        List<Long> finalResult = new ArrayList<>();

        for (int i=result.size()-1; i>=0; i--){

            if(result.get(i)<=1){
                finalResult.add(0,result.get(i));
            }

            if(result.get(i)==2){
                long s = 1;
                finalResult.add(0,s);
                if(i-1 > 0){
                    long temp = result.get(i-1);
                    result.remove(i-1);
                    result.add(i-1,temp+1);
                }else{
                    finalResult.add(0,s);
                }
            }

            if(result.get(i)==3){
                long s = 1;
                finalResult.add(0,s);
                if(i-1 > 0){
                    long temp = result.get(i-1);
                    result.remove(i-1);
                    result.add(i-1,temp+2);
                }else{
                    finalResult.add(0,s);
                    finalResult.add(0,s);
                }
            }
        }
        if(finalResult.get(0)==0){
            finalResult.remove(0);
        }
        for(int i = 0; i<finalResult.size(); i++){
            System.out.print(finalResult.get(i));
        }
    }

    public static void multiply(long a, long b){
        long c = a*b;
        List<Long> result = new ArrayList<>();
        while(c != 0) {
            long num = c%10;
            c = c/10;
            result.add(0,num);
        }

        List<Long> finalResult = new ArrayList<>();

        for (int i=result.size()-1; i>=0; i--){

            if(result.get(i)<=1){
                finalResult.add(0,result.get(i));
            }

            if(result.get(i)==2){
                long s = 1;
                finalResult.add(0,s);
                if(i-1 > 0){
                    long temp = result.get(i-1);
                    result.remove(i-1);
                    result.add(i-1,temp+1);
                }else{
                    finalResult.add(0,s);
                }
            }

            if(result.get(i)==3){
                long s = 1;
                finalResult.add(0,s);
                if(i-1 > 0){
                    long temp = result.get(i-1);
                    result.remove(i-1);
                    result.add(i-1,temp+2);
                }else{
                    finalResult.add(0,s);
                    finalResult.add(0,s);
                }
            }
        }
        if(finalResult.get(0)==0){
            finalResult.remove(0);
        }
        for(int i = 0; i<finalResult.size(); i++){
            System.out.print(finalResult.get(i));
        }
    }

    public static long convertToBinaryNumber(long a){
        long remainder;
        List<Long> target = new ArrayList<>();
        while(a/2 >= 0 && a != 0) {
            remainder = a%2;
            a = a/2;
            target.add(remainder);
        }

        long result = 0;
        for (int i = target.size()-1; i >=0; i--){
            result = result + target.get(i)*(long)Math.pow(10, i);
        }
        return result;
    }

    public static void main(String[] args) {
        long a = 100010;
        long b = 110010;
        long c = 100;
        add(a, b);
        System.out.println("\n");
        multiply(a, b);
        System.out.println("\n");
        System.out.println(convertToBinaryNumber(c));
    }
}
