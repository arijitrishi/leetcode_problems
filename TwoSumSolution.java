import java.util.HashMap;

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();
   for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndexMap.containsKey(complement)) {
                   return new int[]{numIndexMap.get(complement), i};
            }
              numIndexMap.put(nums[i], i);
        }
         return new int[]{};
    } public static void main(String[] args) {
    	TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
} 
