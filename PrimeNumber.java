public class PrimeNumber {
    public static void main(String[] args) {
        int flag = 0;
        int n = 58;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number!");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number!");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number!");
            }
        }
    }
}

