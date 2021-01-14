package code;

import java.util.ArrayList;

public class DIStringMatch_942 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.diStringMatch("IDID"));
//        System.out.println(solution.diStringMatch("III"));
        System.out.println(solution.diStringMatch("DDI"));
    }

    static class Solution {
        public int[] diStringMatch(String S) {
            int length = S.length();
            ArrayList<Integer> diStringArr = new ArrayList<>();
            ArrayList<Integer> temp = new ArrayList<>();


            for (int i = 0; i < length + 1; i++) {
                temp.add(i);
            }


            for (int i = 0; i < length; i++) {
                if (S.charAt(i) == 'I') {
                    diStringArr.add(i, temp.get(0));
                    temp.remove(0);
                } else {
                    diStringArr.add(i, temp.get(temp.size()-1));
                    temp.remove(temp.size()-1);
                }
            }

            if(!temp.isEmpty()){
                for (Integer nums : temp)
                    diStringArr.add(nums);
            }

            return diStringArr.stream().mapToInt(i->i).toArray();
        }
    }
}

