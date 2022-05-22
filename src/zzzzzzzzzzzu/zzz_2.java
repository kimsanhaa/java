package zzzzzzzzzzzu;

import java.util.ArrayList;

public class zzz_2 {
    public int solution(int[] histogram) {
        ArrayList<Integer> plus= new ArrayList<>(histogram.length);
        ArrayList<Integer> minus= new ArrayList<>(histogram.length);
        int plusMax=0;
        int plusMin=0;
        int minusMax=0;
        int minusMin=0;
        int x=0;
        int y=0;
        boolean result =true;
        //합
        for(int i=0;i< histogram.length; i++){
            plus.add(i+histogram[i]);
        }
        plusMax=plus.get(0);
        plusMin=plus.get(0);
        for (int i : plus) {
            if(plusMax<=i){
                plusMax=i;
            }
            if(plusMin>=i){
                plusMin=i;
            }

        }
        //차
        for(int i=0;i< histogram.length; i++){
            minus.add(Math.abs(i-histogram[i]));
        }
        minusMax=minus.get(0);
        minusMin=minus.get(0);
        for (int i : minus) {
            if(minusMax<=i){
                minusMax=i;
            }
            if(minusMin>=i){
                minusMin=i;
            }

        }
        if(Math.abs(plusMax-plusMin)>Math.abs(minusMax-minusMin))result=true;
        else{result=false;}


        if(result==true){
            x= Math.abs(plus.indexOf(plusMax)-plus.lastIndexOf(plusMin))-1;
            //y값 비교
            if(histogram[plus.indexOf(plusMax)]>histogram[(plus.lastIndexOf(plusMin))]) y=histogram[plus.lastIndexOf(plusMin)];
            else{y=histogram[(plus.lastIndexOf(plusMax))];}
        }
        else{
            x= Math.abs(minus.indexOf(minusMax)-minus.lastIndexOf(minusMin))-1;
                if(histogram[minus.indexOf(minusMax)]>histogram[(minus.lastIndexOf(minusMin))]) y=histogram[minus.lastIndexOf(minusMin)];
                else{y=histogram[(minus.lastIndexOf(minusMax))];}


        }

        int answer = x*y;



       return answer;
    }
    public static void main(String[] args) {
        zzz_2 temp  = new zzz_2();
       int [] histogram = new int[]{2, 2, 2, 3};
        //int [] histogram = new int[]{6, 5, 7, 3, 4, 2};
        temp.solution(histogram);

    }
}
