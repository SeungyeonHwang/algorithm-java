package lecture;

import java.util.Scanner;

/**
 * 보이는 학생
 */
class Main13 {
    public int solution(int n, int[] arr) {
        int count = 1;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Main13 T = new Main13();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //출력
        System.out.println(T.solution(n, arr));
    }
}