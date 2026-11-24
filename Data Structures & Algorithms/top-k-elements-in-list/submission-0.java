class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // we can solve this in O(NlogN) time and O(N) space using a priority queue

        Map<Integer, Integer> freqMap = new HashMap<>();
        int[] sol = new int[k];

        // first pass, populate freqs, 0 indexeds
        for(int i = 0; i < nums.length; i++) {
            freqMap.merge(nums[i], 1, Integer::sum);
        }

        // second pass, build max heap N(logN)
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.get(0), a.get(0)));

        String freqStr;

        freqMap.forEach((key, value) -> {
            pq.add(List.of(value, key));
        });

        // pop k elements off heap and return those
        int pqSize = pq.size();

        List<Integer> countPair;

        for(int i = 0; i < Math.min(k, pqSize); i++) {
            countPair = pq.remove();

            // get the digit from the count pair
            sol[i] = countPair.get(1);
        }

        return sol;

    }
}
