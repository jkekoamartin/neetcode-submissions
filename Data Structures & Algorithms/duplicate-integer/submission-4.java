class Solution {
    public boolean hasDuplicate(int[] nums) {
        

        // we can solve this in O(N) time and O(N) space using a hashmap

        Set<Integer> unique = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(unique.contains(nums[i])) return true;
            unique.add(nums[i]);
        }

        return false; 
    }
}