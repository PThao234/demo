public class Bai3 {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n >= 2;
    }

    public static boolean isPrime(long n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n >= 2;
    }

    public static boolean isPrime(float n) {
        int x = (int) n;
        if (x != n) {
            return false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return x >= 2;
        }

    }

    public static boolean isPrime(double n) {
        int x = (int) n;
        if (x != n) {
            return false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return x >= 2;
        }
    }
    public static void main(String[] args) {

        System.out.println(isPrime(2));
        System.out.println(isPrime(8e9));
        System.out.println(isPrime(9.3));
        System.out.println(isPrime(7.4e8));

    }
}
