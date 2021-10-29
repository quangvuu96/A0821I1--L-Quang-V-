package s2_loop_in_java.exercise;


public class First20Primes {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        while (count < 20) {
            if (isPrime(N) ) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
