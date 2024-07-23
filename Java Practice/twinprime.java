import java.util.Scanner;
class TwinPrime {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void checkTwinPrime(int num) {
        if (isPrime(num) && isPrime(num + 2)) {
            System.out.println(num + " and " + (num + 2) + " are twin primes.");
        } else {
            System.out.println(num + " and " + (num + 2) + " are not twin primes.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        checkTwinPrime(num);
    }
}
