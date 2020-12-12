public class ConvertIntegertotheSumofTwoNoZeroIntegers_1317 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = solution.getNoZeroIntegers(2);
//        int[] arr = solution.getNoZeroIntegers(10000);
//        int[] arr = solution.getNoZeroIntegers(69);
        int[] arr = solution.getNoZeroIntegers(1010);
        for (int a : arr){
            System.out.println(a);
        }
    }

    static class Solution {
        public int[] getNoZeroIntegers(int n) {
            for (int i = 1; i < n; i++) {
                int temp = n - i;
                if ((i + "").contains("0") || (temp + "").contains("0")) {
                    continue;
                }
                int arr[] = new int[2];
                arr[0] = i;
                arr[1] = temp;
                return arr;
            }
            return null;
        }
    }
}