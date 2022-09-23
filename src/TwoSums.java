import java.util.*;

public class TwoSums {
    public static void main(String[] args) {
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        int key;
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(m.containsKey(nums[i])) {
                answer[0] = m.get(nums[i]);
                answer[1] = i;
                return answer;
            }

            key = target - nums[i];

            m.put(key,i);
        }
        answer[0] = -1;
        answer[1] = 1;
        return answer;

    }
}
