class Solution {
    public boolean hasDuplicate(int[] nums) {
        

        // we can do this in linear time o(N) using a hashmap and O(N) space. 

        Set<Integer> exists = new HashSet<>();


        // fill counter
        for(int i = 0; i < nums.length; i++) {
            
            if(exists.contains(nums[i])) return true;

            exists.add(nums[i]);
        }


        return false;
    }
}