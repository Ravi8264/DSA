
public class bits {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(bitval(n));
        bitval2(n);
        countsetbit(n);
        countsetbit2(n);
    }

    static int bitval(int n) {
        return n & (n - 1);
    }

    static void bitval2(int n) {
        int p=n;
        int count=0;
        while((p&1)!=1){
            ++count;
            p=p>>1;
        }
        int mask=1<<count;
        System.out.println(n^mask);
    }

    static void countsetbit(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }

    static void countsetbit2(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            ++count;
        }
        System.out.println(count);
    }
}
