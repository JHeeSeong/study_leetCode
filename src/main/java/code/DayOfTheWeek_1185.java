package code;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfTheWeek_1185 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        try {
            System.out.println(solution.dayOfTheWeek(31,8,2019));
//            System.out.println(solution.dayOfTheWeek(15, 8, 1993));
//            System.out.println(solution.dayOfTheWeek(18, 7, 1999));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    static class Solution {
        public String dayOfTheWeek(int day, int month, int year) throws ParseException {
            String inputDate = String.format("%04d", year) + String.format("%02d", month) + String.format("%02d", day);

            DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            Date date = dateFormat.parse(inputDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            switch (calendar.get(Calendar.DAY_OF_WEEK)) {
                case 1:
                    return "Sunday";
                case 2:
                    return "Monday";
                case 3:
                    return "TuesDay";
                case 4:
                    return "WednesDay";
                case 5:
                    return "ThursDay";
                case 6:
                    return "FriDay";
                case 7:
                    return "SaturDay";
            }
            return null;
        }
    }
}
