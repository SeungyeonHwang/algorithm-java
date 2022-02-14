package lecture;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수
 */
class Main17 {

    private boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main17 T = new Main17();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //출력
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}