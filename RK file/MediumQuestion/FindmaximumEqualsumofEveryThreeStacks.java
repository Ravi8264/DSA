import java.util.Stack;

public class FindmaximumEqualsumofEveryThreeStacks {
    public static void main(String[] args) {
        int stack1[] = { 3, 2, 1, 1, 1 };
        int stack2[] = { 4, 3, 2 };
        int stack3[] = { 1, 1, 4, 1 };

        int n1 = stack1.length;
        int n2 = stack2.length;
        int n3 = stack3.length;
        System.out.println(maxEqualSum(n1, n2, n3, stack1, stack2, stack3));

    }

    public static int maxEqualSum(int N1, int N2, int N3, int[] S1, int[] S2, int[] S3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i : S1)
            sum1 += i;
        for (int i : S2)
            sum2 += i;
        for (int i : S3)
            sum3 += i;
        int top1 = 0, top2 = 0, top3 = 0;
      
        while (true) {
            if (N1 == top1 || N2 == top2 || N3 == top3) {
                return 0;
            }
            if (sum1 == sum2 && sum2 == sum3)
                return sum1;
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= S1[top1++];

            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= S2[top2++];
            } else if (sum3 >= sum1 && sum1 >= sum2) {
                sum3 -= S3[top3++];
            }

        }

    }
}
