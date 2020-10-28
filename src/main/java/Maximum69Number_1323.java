import java.util.ArrayList;

public class Maximum69Number_1323 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.maximum69Number(9669));
//        System.out.println(solution.maximum69Number(9996));
        System.out.println(solution.maximum69Number(9999));
    }

    static class Solution {
        public int maximum69Number(int num) {
            String temp = Integer.toString(num);
            char[] chars = temp.toCharArray();

            ArrayList<String> arrayList = new ArrayList<>();
            int point = -1;
            for (int i = 0; i < chars.length; i++) {
                point++;
                arrayList.add(chars[i] + "");
                if (chars[i] == '6') {
                    arrayList.remove(point);
                    arrayList.add("9");
                    break;
                }
            }

            for (int i = point+1; i < chars.length; i++) {
                arrayList.add(chars[i] + "");
            }
            return Integer.parseInt(String.join("", arrayList));
        }
    }
}
