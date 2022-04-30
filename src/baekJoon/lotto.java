package baekJoon;

import java.util.ArrayList;

public class lotto {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        ArrayList<Integer> lottoList = new ArrayList<>(); //로또 당첨번호
        ArrayList<Integer> win_numsList = new ArrayList<>(); //  구매한 로또
        int check = 0;


        //1. list에 넣기
        for(int rep : lottos){
            if(rep ==0) continue;
            lottoList.add(rep);
//            System.out.println(lottoList);
        }
        for(int rep : win_nums){
            win_numsList.add(rep);
        }


        //2.구매한 로또를 로또 당첨번호에 비교 win_numsList -> lottoList에 비교 check 값 확인
        System.out.println("lottoList 사이즈 ="+ lottoList.size());
        System.out.println("win_numsList 사이즈 ="+ win_numsList.size());
        for(int i = 0;i<lottoList.size();i++){
            for(int j=0 ; j<win_numsList.size();j++){
                if(lottoList.get(i)==win_numsList.get(j)) {
                    check++;
                }

            }
        }

        // 3. 최소값 check 와  모르는 번호 mysteryNum 출력
        //최고 순위 알고리즘 = 최고 = 모르는 번호가 다 맞았다고 가정 최소에다가 + 미스테리 = 최고로 많이 맞는 값

        int mysteryNum =win_numsList.size()- lottoList.size();
        int bestNUm = mysteryNum+check;
        System.out.println("best 예상 = "+bestNUm +"개 맞음");
        System.out.println("worst 예상  = "+check+"개 맞음");
        // 순위측정 알고리즘
//        if(bestNUm==0){
//            answer[0]=6;
//            answer[1]=7-check;
//            System.out.println("bestNUm = 0");}
//        if(check==0){
//            answer[1]=6;
//            answer[0]=7-bestNUm;
//        System.out.println("check = 0");}
//        if(check+bestNUm==0){
//            answer[0]=6;
//            answer[1]=6;
//        }
//        else{
//            answer[0]=7-bestNUm;
//            answer[1]=7-check;
//
//        }
//        for(int i=0; i<2;i++){
//            System.out.println(answer[i]);
//        }
        //둘다 0인 경우
        if(bestNUm+check==0){
            answer[0]=6;
            answer[1]=6;
        }
        // bestNum은 0이고 check는 아닌경우
        else if (bestNUm==0){
            if(check!=0){
                answer[0]=6;
                answer[1]=7-check;
            }
        }
        else if(check==0){
            if(bestNUm!=0){
                answer[1]=6;
                answer[0]=7-bestNUm;
            }
        }
        else{
            answer[0]=7-bestNUm;
            answer[1]=7-check;

        }
        for(int i=0; i<2;i++){
            System.out.println(answer[i]);}

        return answer;


    }
    public static void main(String[] args) {
        lotto lotto = new lotto();
        //int [] lottos = {44, 1, 0, 0, 31, 25}; //민우가 구매한 로또  0은 모르는 번호
        int [] lottos = {0, 0, 0, 0, 0, 0};
      //  int[] win_nums = {31, 10, 45, 1, 6, 19}; //로또 당첨 번호
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        lotto.solution(lottos,win_nums);
    }
}
