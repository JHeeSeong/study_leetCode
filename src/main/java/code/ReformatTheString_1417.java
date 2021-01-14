package code;

import java.util.ArrayList;

public class ReformatTheString_1417 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reformat("a0b1c2"));
//        System.out.println(solution.reformat("leetcode"));
//        System.out.println(solution.reformat("1229857369"));
//        System.out.println(solution.reformat("covid2019"));
//        System.out.println(solution.reformat("ab123"));
    }

    static class Solution {
        public String reformat(String s) {
            if(s.length()==1)
                return s;
            char[] chars = s.toCharArray();
            ArrayList<String> strings = new ArrayList<>();
            ArrayList<Integer> ints = new ArrayList<>();

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 0x30 && chars[i] <= 0x39) {
                    ints.add(Integer.parseInt(chars[i] + ""));
                } else {
                    strings.add(chars[i] + "");
                }
            }

            if (ints.size() == 0 || strings.size() == 0)
                return "";

            String result = "";
            for (int i = 0; i < chars.length / 2; i++) {
                if (strings.size() > ints.size()) {
                    result += strings.get(i);
                    result += ints.get(i);
                } else {
                    result += ints.get(i);
                    result += strings.get(i);
                }
            }
            if (ints.size() > strings.size())
                result += ints.get(ints.size() - 1);
            if (strings.size() > ints.size())
                result += strings.get(strings.size() - 1);

            return result;
        }
    }
}

