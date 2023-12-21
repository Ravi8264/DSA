import java.util.Arrays;

class Item {
    int wt, value;

    public Item(int value, int wt) {
        this.wt = wt;
        this.value = value;
    }

}

public class FractionalKnapsackProblem {
    static double fractionkSnap(Item[] items, int capicity) {
        Arrays.sort(items, (o1, o2) -> {
            // double ratioOfThis = (double) o2.value / o2.wt;
            // double ratioOfThat = (double) o1.value / o1.wt;
            // return Double.compare(ratioOfThis, ratioOfThat);
            return (int) o2.value / o2.wt - (int) o1.value / o1.wt;
        });
        double profit = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].wt <= capicity) {
                profit += items[i].value;
                capicity -= items[i].wt;
            } else {
                // double fractionProfit = ((double) items[i].value * capicity);
                double fractionProfit2 = ((double) items[i].value / items[i].wt);
                // System.out.println(fractionProfit+" "+fractionProfit2);
                // fractionProfit = fractionProfit /items[i].wt;
                fractionProfit2 = fractionProfit2 * capicity;

                profit += fractionProfit2;
                break;
            }
        }

        System.out.printf("%.14f\n", profit);
        return profit;

    }

    public static void main(String[] args) {
        // 12 40
        // 70 120 10 130 160 30 20 150 210 60 170 50
        // 110 160 50 130 60 180 170 220 230 30 120 200

        int values[] = { 70, 120, 10, 130, 160, 30, 20, 150, 210, 60, 170, 50 };
        int weights[] = { 110, 160, 50, 130, 60, 180, 170, 220, 230, 30, 120, 200 };
        int n = values.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }
        int w = 40;
        System.out.println(fractionkSnap(items, w));

    }

}
