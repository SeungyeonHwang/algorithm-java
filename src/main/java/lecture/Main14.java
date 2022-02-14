package lecture;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 가위 바위 보
 */
class Main14 {
    public String[] solution(int n, int[] arrA, int[] arrB) {
        String[] answer = new String[n];

        System.out.println(n);
        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));

        for (int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i]) {
                answer[i] = "D";
            } else if (arrA[i] == 1) { // 가위
                switch (arrB[i]) {
                    case 2: answer[i] = "B"; //바위
                        break;
                    case 3: answer[i] = "A"; //보
                        break;
                }
            } else if (arrA[i] == 2) { //바위
                switch (arrB[i]) {
                    case 1: answer[i] = "A"; //가위
                        break;
                    case 3: answer[i] = "B"; //보
                        break;
                }
            } else if (arrA[i] == 3) { //보
                switch (arrB[i]) {
                    case 1: answer[i] = "B"; //가위
                        break;
                    case 2: answer[i] = "A"; //바위
                        break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main14 T = new Main14();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrB[i] = kb.nextInt();
        }

        //출력
        for (String x : T.solution(n, arrA, arrB)) {
            System.out.println(x);
        }
    }
}