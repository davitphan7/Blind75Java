import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) throws Exception {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        int key;
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
           key = target - nums[i];

           if(m.containsKey(key)){
               answer[0] = m.get(key);
               answer[1] = i;
               return answer;
           }

           m.put(key,i);
        }

        throw new Exception("No element in array sums to target");

    }
}
