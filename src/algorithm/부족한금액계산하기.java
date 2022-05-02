package algorithm;

import static java.lang.Math.abs;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = money;

        for(int i=1; i<= count; i++){
            answer = answer - price * i;
        }
        if(answer<0)answer = abs(answer);
        else {answer = 0;}

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        부족한금액계산하기 temp = new 부족한금액계산하기();
        int price = 3;
        int money = 20;
        int count = 2;

        temp.solution(price, money, count);


    }
}
