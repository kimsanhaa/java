package algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수_2 {

    // Hash를 이용한 문제
    //1. hash 만들기 -> key에 선수의 이름을, value의 count를 갖는 Hash Map을 만든다.
    //2. hash 빼기  -> completion에 존재하는 선수들의 hash를 뺀다.
    //3. 마지막주자 -> value가 남아있는 선수가 완주하지 못한 선수이다.

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //1. hash map을 만든다. (participant)
        HashMap<String , Integer> map = new HashMap<>();
        for(String player : participant)
            map.put(player, map.getOrDefault(player,0)+1);
        System.out.println(map);
        //2. hash map을 뺀다 (completion)
        for(String player : completion){
            map.put(player, map.get(player)-1);
        }
        //3. value가 0이 아닌 마지막 주자를 찾는다.
        for(String key : map.keySet()){
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
      //  String[] participant=new String[] {"mislav", "stanko", "mislav", "ana"};
        //String[] completion = new String[] {"stanko", "ana", "mislav"};
        String[] participant=new String[] {"leo", "kiki", "eden"};
        String[] completion=new String[] {"eden", "kiki"};
        완주하지못한선수_2 temp = new 완주하지못한선수_2();
        temp.solution(participant,completion);
    }
}
