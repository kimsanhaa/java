package zzzzzzzzzzzu;

import java.util.ArrayList;

public class zzz_4 {
    public int[] solution(int[][] data) {
        ArrayList<Integer> dataArry = new ArrayList<>(data.length);
        int [][] dataCheck = new int[data.length+1][data.length+1];

        //1. datacheck를 이용하여 현재 index의 {1문서번호 ,2.인쇄요청 최소값, 3.페이지수 최소값 넣기}
        //2. for문을 돌면서 현재 index값이 그 다음의 항의 인쇄요청 최소값, 페이지수를 조건에 맞게 비교하고 작으면 유지, 크면 바꾸기
        //3. datacheck 값 출력

        for (int i = 1; i < data.length; i++) {
            dataArry.add(data[i][0]);
        }


        ArrayList<Integer> printRule = new ArrayList<>(data.length);
        int [] queue = new int[data.length];
     int time=0;
        //처음은 일단 넣기

            for(int i=0; i<30; i++) {
                printRule.add(data[0][0]);
                time = data[0][2];

                int minPage = data[1][2];
                for (int[] datum : data) {
                    if (minPage > datum[2]) {

                        minPage = datum[2];
                        printRule.add(datum[0]);
                        dataArry.remove(Integer.valueOf(datum[0]));
                    }

                }

            }





        int[] answer = {};
        return answer;
    }
    public static void main(String[] args) {
        zzz_4 temp  = new zzz_4();
       int [][] data = new int[][]{{1, 0, 5},{2, 2, 2},{3, 3, 1},{4, 4, 1},{5, 10, 2}};
        temp.solution(data);

    }
}
