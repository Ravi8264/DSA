import java.util.Arrays;

public class flightbooking {
    public static void main(String[] args) {
        int Bookings[][] = { { 1, 2, 10 }, { 2, 3, 20 }, { 2,5,25} };
        int ans[] = new Solution().corpFlightBookings(Bookings, 5);
    }
}

class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int a[] = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            for (int j = bookings[i][0]; j <= bookings[i][1]; j++) {
                a[j - 1] += bookings[i][2];
            }
        }
        System.out.println(Arrays.toString(a));
        return a;

    }
}