public class majorityElement {
    public static void main(String[] args) {
        int a[] = { 3, 3, 4, 2, 4, 4, 2, 4 };
        System.out.println(majority(a));
    }

    static int majority(int a[]) {
        int count = 1;
        int majorityVal = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == majorityVal) {
                ++count;
            } else {
                --count;
            }
            if (count == 0) {
                majorityVal = a[i];
                count = 1;
            }
        }
        int freq = 0;
        for (int e : a)
            if (e == majorityVal)
                ++freq;
        return freq > (a.length / 2) ? majorityVal : -1;
    }

}
