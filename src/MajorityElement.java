import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        // num, count
        int max = nums[0];
        for (int n: nums) {

            if (counter.containsKey(n)){
                counter.replace(n , counter.get(n) + 1);
            }
            else
                counter.put(n, 1);

            if (counter.get(max) < counter.get(n))
                max = n;

        }

        return max;
    }

}
