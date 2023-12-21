import java.util.Arrays;

class activity {
    int start;
    int finish;

    activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

}

public class ActivitySelection {

    static int activitySelection(int s[], int f[]) {

        int n = s.length;
        activity[] activities = new activity[n];
        for (int i = 0; i < n; i++) {
            activities[i] = new activity(s[i], f[i]);
        }
        Arrays.sort(activities, (o1, o2) -> o1.finish - o2.finish);
        int count = 1;
        int curFinish = activities[0].finish;
        for (int i = 1; i < n; i++) {
            if (activities[i].start > curFinish) {
                ++count;
                curFinish = activities[i].finish;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int s[] = { 20, 6, 8, 30, 24, 13, 26, 29, 7, 35, 1, 10, 4, 18, 37, 28, 21, 5, 25, 23, 38, 33, 31, 15, 2, 14, 11,
                34,36, 19, 9, 3, 12, 16 };
        int f[] = { 27, 8, 12, 40, 24, 20, 30, 37, 8, 38, 1, 10, 9, 26, 38, 34, 22, 11, 27, 26, 48, 42, 33, 21, 10, 21,
                13,
                40, 38, 28, 16, 3, 13, 24 };

        System.out.println(activitySelection(s, f));

    }

}
