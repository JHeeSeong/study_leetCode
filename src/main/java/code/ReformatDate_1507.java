package code;

public class ReformatDate_1507 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.reformatDate("20th Oct 2052"));
//        System.out.println(solution.reformatDate("6th Jun 1933"));
        System.out.println(solution.reformatDate("26th May 1960"));
    }

    static class Solution {
        public String reformatDate(String date) {
            String[] strings = date.split(" ");

            return strings[2] + "-" + String.format("%02d", Month.valueOf(strings[1]).ordinal()) + "-" + String.format("%02d", Integer.parseInt(strings[0].substring(0, strings[0].length() - 2)));
        }
    }

    enum Month {
        none,
        Jan,
        Feb,
        Mar,
        Apr,
        May,
        Jun,
        Jul,
        Aug,
        Sep,
        Oct,
        Nov,
        Dec,
        ;
    }
}

