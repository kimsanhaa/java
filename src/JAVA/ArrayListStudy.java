package JAVA;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListStudy {


    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // 타입 미설정시 Object로 선언된다.
        ArrayList<Integer> num = new ArrayList<Integer>(); //int만 가능
        ArrayList<Integer> num_1 = new ArrayList<>() ; //생략가능
        ArrayList<Integer> num_2 = new ArrayList<>(10); //초기 크기 설정;
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3)); //생성시 값추가

        //값 추가
        ArrayList<Integer> list_3 = new ArrayList<>();
        list_3.add(3);
        list_3.add(null);
        list_3.add(1,10); //1인덱스에 10추가;

        ArrayList<Integer> list_4 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        list_4.remove(1);  //index 1 제거
        list_4.clear();  //모든 값 제거




    }
}
