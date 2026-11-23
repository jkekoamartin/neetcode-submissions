class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] sol = new int[temperatures.length];

        Arrays.fill(sol, 0);

        Stack<Integer> temps = new Stack<>();

        int days = 0;

        for(int i = temperatures.length - 1; i >= 0; i--) {
            while (!temps.isEmpty() && temperatures[i] >= temperatures[temps.peek()]) {
                temps.pop();
            }
            if (!temps.isEmpty()) {
                sol[i] = temps.peek() - i;
            }
            temps.push(i);
        }

        return sol;
    }
}
