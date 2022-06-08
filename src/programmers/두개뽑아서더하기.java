package programmers;

import java.util.ArrayList;
import java.util.HashSet;

public class 두개뽑아서더하기 {
    public static int[] solution(int[] numbers) {


        HashSet<Integer> hashSet=new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i==j) continue;
                else{
                    hashSet.add(numbers[i]+numbers[j]);
                }

            }



        }

        int[] answer = new int[hashSet.size()];
        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);

        for (int i = 0; i < answer.length; i++) {
            answer[i]=arrayList.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int [] numbers = new int[]{5,0,2,7};
        solution(numbers);
    }
}
