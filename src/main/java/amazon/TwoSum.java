package amazon;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
    * Method 1
    */

    static int[] twoSum(int[] nums, int target){
        int sum = 0;
        int[] res = {-1,-1};
        for (int i = 0; i<nums.length-1; i++){
            for (int j = i+1; j<nums.length; j++){
                sum = nums[i]+nums[j];
                if(sum == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    /*
    * Method 2
    */

    static int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int a;
        int b;
        int[] res = {-1,-1};
        for (a = 0; a < nums.length; a++) {
            int key = target - nums[a];
            if (map.containsKey(key) && a != map.get(key)) {
                b = map.get(key);
                res[0] = a;
                res[1] = b;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums,target);
        int[] res2 = twoSum2(nums,target);
        System.out.println(toString(res));
        System.out.println(toString(res2));
    }


    public static String toString(int[] nums){
        return "["+nums[0] + "," +nums[1] + "]";
    }
}
