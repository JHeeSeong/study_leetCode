package code;

public class SubstractTheProductAndSumOfDigitsOfAnInteger_1281 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.subtractProductAndSum(234));
    }

    static class Solution {
        public int subtractProductAndSum(int n) {
            String a = n + "";
            char[] chars = a.toCharArray();

            int subResult = 1;
            int sumResult = 0;
            for (int i = 0; i < chars.length; i++) {
                subResult *= Integer.parseInt(chars[i] + "");
                sumResult += Integer.parseInt(chars[i] + "");
            }

            return subResult - sumResult;
        }
    }
}
