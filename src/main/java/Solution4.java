import java.util.Stack;

/**
 * Lv. 1 크레인 인형뽑기 게임
 * int[][] board = {
 * 1  2  3  4  5
 * {0, 0, 0, 0, 0},
 * {0, 0, 1, 0, 3},
 * {0, 2, 5, 0, 1},
 * {4, 2, 4, 4, 2},
 * {3, 5, 1, 3, 1}
 * };
 * int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
 */
class Solution4 {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[i][move - 1]);
                        board[i][move - 1] = 0;
                        break;
                    }

                    if (board[i][move - 1] == stack.peek()) {
                        stack.pop();
                        board[i][move - 1] = 0;
                        answer += 2;
                    } else {
                        stack.push(board[i][move - 1]);
                        board[i][move - 1] = 0;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
