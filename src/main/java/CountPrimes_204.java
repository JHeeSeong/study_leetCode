public class CountPrimes_204 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countPrimes(10));
        System.out.println(solution.countPrimes(0));
        System.out.println(solution.countPrimes(1));
        System.out.println(solution.countPrimes(2));
        System.out.println(solution.countPrimes(499979));
    }

    static class Solution {
        public int countPrimes(int n) {
            int count = 0;
            boolean isPrimes;
            for (int i = 2; i < n; i++) {
                isPrimes = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrimes = false;
                    }
                    continue;
                }
                if (isPrimes)
                    count++;
            }

            return count;
        }
    }
}
