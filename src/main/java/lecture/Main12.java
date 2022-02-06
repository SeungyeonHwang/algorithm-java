package lecture;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 큰 수 출력하기
 */
class Main12 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main12 T = new Main12();
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