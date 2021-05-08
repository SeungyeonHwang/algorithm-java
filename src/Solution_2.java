import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 완주하지 못한 선수
 * 완주하지 못한 선수의 이름을 return
 */
public class Solution_2 {
    public String solution(String[] participant, String[] completion) {

        Map<String, Long> participantMap = Arrays.asList(participant).stream()  //stream 생성
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));    //요소 자체를 받아서 카운팅

        System.out.println("participantMap = " + participantMap);


        //완주자 목록을 돌린다
        for (String name : completion) {

            Long value = participantMap.get(name) - 1L;
            //참가자 숫자 - 완주자 숫자
            System.out.println("value = " + value);

            //완주자 -> Map에서 제거(없는 사람 남기기 위해)
            if (value == 0L) {
                participantMap.remove(name);
            } else {
                System.out.println();
                System.out.println("participantMap = " + participantMap);
                //return
                participantMap.put(name, value);    //key 값은 중복이 안되기 때문에 값이 갱신됨
                System.out.println("participantMap = " + participantMap);
            }
        }
        System.out.println();
        System.out.println(participantMap.keySet().iterator().next());
        return participantMap.keySet().iterator().next();

    }

    @Test
    public void Answer() {
        Assertions.assertEquals("mislav", solution(
                new String[]{"mislav", "stanko", "mislav", "ana", "mislav"},  //참가자
                new String[]{"stanko", "ana", "mislav"}));  //완주자
    }
}