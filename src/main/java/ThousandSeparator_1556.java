public class ThousandSeparator_1556 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.thousandSeparator(987));
//        System.out.println(solution.thousandSeparator(1234));
//        System.out.println(solution.thousandSeparator(123456789));
        System.out.println(solution.thousandSeparator(0));
    }

    static class Solution {
        public String thousandSeparator(int n) {
            StringBuffer buffer = new StringBuffer(n + "");

            int count = 0;
            for (int i = buffer.length() - 1; i >= 0; i--) {
                count++;
                if (count % 3 == 0)
                    buffer.insert(i, ".");
            }
            if (buffer.charAt(0) == '.')
                buffer.delete(0, 1);
            return buffer.toString();
        }
    }
}

