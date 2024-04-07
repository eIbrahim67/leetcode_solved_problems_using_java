public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        int scout = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[scout] && i > scout + 1){
                nums[scout + 1] = nums[i];
                scout++;

            }
            else if(nums[i] != nums[scout])
                scout = i;
        }
        return ++scout;
    }
}
