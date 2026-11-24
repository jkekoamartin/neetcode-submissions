class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        
        // we can do this in O(m * n) and O(m) space by iterating over entire list char by char. 

        Map<String, List<String>> sublist = new HashMap<>();
        List<List<String>> sol = new ArrayList<>();

        // we can track anagrams in a map

        int[] ana;
        String id;
        List<String> sub;

        for(int i = 0; i < strs.length; i++) {
            ana = new int[26];
            for(int j = 0; j < strs[i].length(); j++) {
                // 
                ana[strs[i].charAt(j) - 'a']++; 
            }

            // if ana is in map, append, otherwise and new array list with key
            id = getId(ana);

            sublist.computeIfAbsent(id, key -> new ArrayList<>()).add(strs[i]);

        }
  
        sublist.forEach((key, value) -> {
            sol.add(value);
        });

        return sol;
    }

    public String getId(int[] ana) {
        StringBuilder id = new StringBuilder();

        for (int i = 0; i < ana.length; i++) {
            if (ana[i] != 0) {
                id.append(ana[i]).append((char) ('a' + i));
            }
        }

        return id.toString();
    }

}
