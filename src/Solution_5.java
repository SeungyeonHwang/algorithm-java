import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 키패드 누르기
 */
public class Solution_5 {

    //0부터 9까지 좌표 {y,x}
    int[][] numpadPos = {
            {3, 1}, //0
            {0, 0}, //1
            {0, 1}, //2
            {0, 2}, //3
            {1, 0}, //4
            {1, 1}, //5
            {1, 2}, //6
            {2, 0}, //7
            {2, 1}, //8
            {2, 2}  //9
    };

    //초기 위치
    int[] leftPos = {3, 0};
    int[] rightPos = {3, 2};
    String hand;
    public String solution(int[] numbers, String hand) {
        this.hand = (hand.equals("right")) ? "R" : "L";
        StringBuilder answer = new StringBuilder();

        for (int number : numbers) {
            String Umji = pushNumber(number);
            answer.append(Umji);

            if (Umji.equals("R")) {
                rightPos = numpadPos[number];
                continue;
            }
            if (Umji.equals("L")) {
                leftPos = numpadPos[number];
                continue;
            }

        }
        return answer.toString();
    }

    private String pushNumber(int num) {
        if (num == 1 || num == 4 || num == 7) return "L";
        if (num == 3 || num == 6 || num == 9) return "R";

        //2580 어느쪽이 더 가까운지 확인 -> L or R
        if (getDistance(leftPos, num) > getDistance(rightPos, num)) return "R";
        if (getDistance(leftPos, num) < getDistance(rightPos, num)) return "L";

        return hand;
    }

    private int getDistance(int[] pos, int num) {
        //x좌표 차의 절대값 + y좌표 차의 절대값
        return Math.abs(pos[0] - numpadPos[num][0]) + Math.abs(pos[1] - numpadPos[num][1]);
    }

    @Test
    public void Answer() {
        Assertions.assertEquals("LRLLLRLLRRL", solution(
                new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},
                "right"));
    }
}