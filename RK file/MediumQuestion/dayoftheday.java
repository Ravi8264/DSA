public class dayoftheday {
    public static void main(String[] args) {
        int d = 1;
        int m = 1;
        int y = 1970;
        System.out.println(new Solution().dayofweek(d, m, y));
    }
}

class Solution {
    public static int dayofweek(int d, int m, int y) {
        int months[] = { '0', 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] s = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int day =d+3;  
        for (int i = 1970; i < y; i++) {
            if (isleapyear(i))
                day += 366;
            else
                day += 365;
        }
        for (int i = 1; i < m; i++) {
            if (i == 2 && isleapyear(y))
                day++;
            day += months[i];
        }
        if (day > 0)
            System.out.println(s[day % 7]);
        return day % 7;
    }

    static boolean isleapyear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}