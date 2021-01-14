package code;

import java.util.ArrayList;

public class DefanginganIPAddress_1108 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.defangIPaddr("1.1.1.1"));;
    }

    static class Solution {
        public String defangIPaddr(String address) {
            return address.replaceAll("\\.", "[.]");
        }
    }
}
