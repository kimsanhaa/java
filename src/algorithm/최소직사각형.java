package algorithm;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.ArrayList;
import java.util.Collections;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        ArrayList<Integer> largeRow = new ArrayList<>();
        ArrayList<Integer> largeCol = new ArrayList<>();
        ArrayList<Integer> listAllProduct = new ArrayList<>(); //전부 곱한거
        ArrayList<Integer> listProduct = new ArrayList<>(); //자기 끼리 곱한거
        int bestNum = 0;
        int i = 0;
        int answer = 0;

        for(int num =0; num< sizes.length; num++){
            listProduct.add(sizes[num][0]*sizes[num][1]);
        }

        for(int[] rep : sizes){
            largeRow.add(rep[0]);
            i++;
        }

        for(int[] rep : sizes){
            largeCol.add(rep[1]);
            i++;
        }

        for(int j : largeRow){
            for (int k : largeCol){
                listAllProduct.add(j*k);


            }
        }

        if(Collections.max(largeRow)>=Collections.max(largeCol)){
            bestNum = Collections.max(largeRow);

        }
        else if(Collections.max(largeRow)<=Collections.max(largeCol)){
            bestNum = Collections.max(largeCol);
        }

//        for(int check : listAllProduct){
//            if(Collections.max(listProduct)<=check && check<=Collections.max(largeRow) * Collections.max(largeCol)&& check%bestNum==0){
//                answer = check;
//                break;
//            }
//            }
//}
        System.out.println(answer);
        return answer;



    }
    public static void main(String[] args) {
        최소직사각형 temp = new 최소직사각형();
        int [][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        temp.solution(sizes);

    }
}
