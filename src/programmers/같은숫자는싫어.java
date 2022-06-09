package programmers;

import java.util.ArrayList;
import java.util.HashSet;

public class 같은숫자는싫어 {

        public static int[] solution(int []arr) {
            int[] answer;

            ArrayList<Integer> arrayList = new ArrayList<>();
            ArrayList<Integer> arrayList_1 = new ArrayList<>();
            for (int i : arr) {
                arrayList.add(i);
            }

            for (int i = 0; i <= arr.length-2; i++) {
                System.out.println(i);
                    if(arrayList.get(i)!= arrayList.get(i+1)){
                        arrayList_1.add(arr[i]);
                    }

            }
            arrayList_1.add(arr[arr.length-1]);

            answer = new int[arrayList_1.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i]=arrayList_1.get(i);

            }

            return answer;
        }

    public static void main(String[] args) {
            int [] arr = new int[]{4,4,4,3,3};
            solution(arr);
    }


}
