class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // we can solve this in O(N) and O(N) space by tracking sum complements in hashmap

        Map<Integer, Integer> comps = new HashMap<>();
        int[] sol = new int[2];


        int comp;

        for(int i = 0; i < nums.length; i++) {

            // calc comp
            comp = target - nums[i];

            // if the map contains the comp for this num
            if(comps.containsKey(nums[i])) return new int[] {comps.get(nums[i]), i};

            comps.put(comp, i);

        }

        

        return sol;
    }
}
