package programmers;

import java.util.ArrayList;

public class 진법3뒤집기 {
    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> ternary = new ArrayList<>();
        while(n !=0 ){
            ternary.add(n%3);
            n=n/3;
        }

        int tmp=1;
        for (int i = ternary.size()-1; i>=0 ;i--) {
           answer += ternary.get(i)*tmp;
           tmp*=3;
        }

            return answer;

    }

    public static void main(String[] args) {
        solution(45);

    }
}
