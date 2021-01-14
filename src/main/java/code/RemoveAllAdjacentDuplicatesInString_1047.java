package code;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllAdjacentDuplicatesInString_1047 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates("abbaca"));
    }

    static class Solution {
        public String removeDuplicates(String S) {
            char[] stringArr = S.toCharArray();


            List<String> myList = new ArrayList<>();
            for (char c : stringArr)
                myList.add(c + "");

            int i = 0;
            while (i < myList.size() - 1) {
                if (myList.get(i).equals(myList.get(i + 1))) {
                    myList.remove(i + 1);
                    myList.remove(i);
                    i = 0;
                    continue;
                }
                i++;
            }

            String result = "";
            for (String s : myList)
                result += s;
            return result;
        }
    }
}
