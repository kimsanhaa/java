package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class 구명보트 {
    public static int solution(int[] people, int limit) {
        int answer = 1;
        int temp = limit;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < people.length; i++) {
            arrayList.add(people[i]);
        }

        Collections.sort(arrayList);

        for (int i = 0; i < people.length; i++) {
             int person = people[i];
                limit=limit-person;

              if(limit<40){
                  if(i==people.length-1)continue;
                  limit=temp;
                  answer++;
              }
            }



        return answer;
    }
    public static void main(String[] args) {
int [] people = new int[]{70, 80,50};
int limit = 100;
        solution(people,limit);


    }
}
