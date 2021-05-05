import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

//폰켓몬
public class Solution_1 {
    public int solution(int[] nums) {
        int max = nums.length / 2;

        //중복 제거
        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        //중복제거의 Set의 크기가 max보다 크면 -> max , 작으면 numSet.size return
        if (numSet.size() > max) {
            return max;
        } else {
            return numSet.size();
        }
    }

    @Test
    public void Answer() {
        Assertions.assertEquals(2, solution(new int[]{3, 1, 2, 3}));
    }
}