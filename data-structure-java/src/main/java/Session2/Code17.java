package Session2;

public class Code17 {
    public static void main(String[] args) {
        for (int n = 2; n <= 100000; n++) {
            if (isPrime(n)) {
                System.out.println(n);
            }
        }
    }

    static boolean isPrime(int k) {
        if (k < 2) return false;
        for (int i = 2; i * i <= k; i++)
            if (k % i == 0)
                return false; //값을 돌려주는 역할, 실행 중단시키는 역할
        return true;
    }
}
