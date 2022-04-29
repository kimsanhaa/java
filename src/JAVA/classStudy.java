package JAVA;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class classStudy {

    public int solution(int n) {
        int answer = 0;
        final int N = n;
        HashSet<Integer> remainList = new HashSet<>();
        HashSet<Integer> arrayList = new HashSet<>();
        remainList.add(1);

        for(int i=2;i<=n; i++ ){
        while(n%i==0){
            remainList.add(i);

            n = n/i;

        }
    }
        for(int List : remainList){
            arrayList.add(N/List);
        }

        HashSet<Integer> addSet = new HashSet<>();
        addSet.addAll(remainList);
        addSet.addAll(arrayList);

        for (int list : addSet){
            answer += list;
        }
        System.out.println(answer);


        return answer;
    }
    public static void main(String[] args) {
        classStudy temp = new classStudy();
        temp.solution(100);
        System.out.println(1%2);
        
    }

}
