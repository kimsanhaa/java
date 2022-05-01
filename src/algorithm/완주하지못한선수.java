package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class 완주하지못한선수 {


    //마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
    // 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

    public String solution(String[] participant, String[] completion) {

        HashMap<Integer , String >particpantList = new HashMap<>(); //참가자
        HashMap<Integer , String >completionList = new HashMap<>(); //참가자
        String answer = "";


        for (String rep:participant){
            int i = 0;
            particpantList.put(i,rep);
            i++;
        }

        for (String rep:completion){
            int i = 0;
            completionList.put(i,rep);
            i++;
        }
  //particpantList에는 completionList와 중복된 값들만 남게 된다.
     //   A랑 B랑 비교해서 같으면 B에값 지우고 answer에 넣기
//        for(int i=0; i<particpantList.size(); i++){
//            for(String rep : completionList){
//                System.out.println(particpantList.get(i)+ "   VS  " + rep + "비교중....");
//                if (particpantList.get(i).equals(rep)) {
//                    System.out.println(particpantList.get(i)+"지워짐!");
//                    //completionList.remove(j);
//                    temp.remove(particpantList.get(i));
//                    continue;
//
//
//                }
//            }
//
//        }


//        for(int i=0; i<particpantList.size(); i++) {
//            Iterator<String> iter = completionList.iterator();
//            while (iter.hasNext()) {
//                String temp = iter.next();
//                System.out.println(temp.toString());
//                if(completionList.get(i).equals(temp.toString())){
//                    System.out.println(completionList + "   VS   " + temp.toString());
//                }
//
//
//
//            }
//        }



        return answer;
    }
    public static void main(String[] args) {

      //  String[] participant=new String[] {"leo", "kiki", "eden"};
       // String[] completion = new String[] {"eden", "kiki"};

        String[] participant=new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[] {"stanko", "ana", "mislav"};
        완주하지못한선수 temp = new 완주하지못한선수();
        temp.solution(participant,completion);
    }
}
