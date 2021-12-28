/**
 * Lv. 1 키패드 누르기
 */
class Solution3 {

    //0~9 좌표 {x,y}
    int[][] numPad = {
            {1,0}, //0
            {0,3}, //1
            {1,3}, //2
            {2,3}, //3
            {0,2}, //4
            {1,2}, //5
            {2,2}, //6
            {0,1}, //7
            {1,1}, //8
            {2,1}  //9
    };
    //초기 위치
    int[] nowL = {0, 0};
    int[] nowR = {2, 0};
    String hand;

    public String solution(int[] numbers, String hand) {
        this.hand = (hand.equals("right")) ? "R" : "L";

        String answer = "";
        for (int num : numbers) {
            String Umji = pushNum(num);
            answer += Umji;

            if (Umji.equals("L")) {
                nowL = numPad[num];
                continue;
            }
            if (Umji.equals("R")) {
                nowR = numPad[num];
                continue;
            }
        }
        return answer;
    }

    private String pushNum(int num) {
        if (num == 1 || num == 4 || num == 7) return "L";
        if (num == 3 || num == 6 || num == 9) return "R";

        if (getDist(nowL, num) > getDist(nowR, num)) return "R";
        if (getDist(nowL, num) < getDist(nowR, num)) return "L";

        return this.hand;
    }

    private int getDist(int[] now, int num) {
        return Math.abs(now[0] - numPad[num][0]) + Math.abs(now[1] - numPad[num][1]);
    }
}