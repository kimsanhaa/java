package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class 완주하지못한선수_1 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(String rep: participant){
            System.out.println(rep);
        };
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for(String rep : completion){
            System.out.println(rep);
        }


        //for문을 이용한 풀이
        // 1. 정렬을 한다,\
        // 2.같은 index에 똑같은 값이 있는지 확인
        // 3.다르면 출력
        for(int i=0; i< completion.length;i++){
            if(!participant[i].equals(completion[i])){
                System.out.println(participant[i] + " ㅋ미 완주 ~ ");
                answer =  participant[i];
                break;
            }

        }
        // 하지만 for문을 completion 기준으로 하기 때문에 마지막 미 완주자는 확인을 못함
        // 그래서 마지막에 if문을 통해서 answer 값이 빈 값이면 particpant값의 마지막 값을 answer에 넣어준다.
        if (answer.equals("")){
            int lastIndex = participant.length-1;
            answer =participant[lastIndex];
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
      //  String[] participant=new String[] {"mislav", "stanko", "mislav", "ana"};
        //String[] completion = new String[] {"stanko", "ana", "mislav"};
        String[] participant=new String[] {"leo", "kiki", "eden"};
        String[] completion=new String[] {"eden", "kiki"};
        완주하지못한선수_1 temp = new 완주하지못한선수_1();
        temp.solution(participant,completion);
    }
}
