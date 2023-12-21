public class GasStation {
    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };
        System.out.println(canCompleteCircuit(gas, cost));

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalgas = 0;
        int totalcost = 0;
        for (int i : gas)
            totalcost += i;
        for (int i : cost)
            totalcost += i;
        if (totalgas > totalcost)
            return -1;
        int current = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            current += gas[i] - cost[i];
            if (current < 0) {
                start = i + 1;
                current = 0;

            }
        }
        return start;
    }

}
