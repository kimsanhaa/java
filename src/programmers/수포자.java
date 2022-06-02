package programmers;

import java.util.ArrayList;

public class 수포자 {

    public ArrayList<Integer> solution(int[] answers) {
        int [] list = new int[100];


        int []supo_1 ={1,2,3,4,5};
        int []supo_2 ={2,1,2,3,2,4,2,5};
        int []supo_3 ={3,3,1,1,2,2,4,4,5,5,};



        for(int i=0; i<answers.length; i++){
            if(answers[i]==supo_1[i])list[0]++;
            if(answers[i]==supo_2[i])list[1]++;
            if(answers[i]==supo_3[i])list[2]++;
        }
        int [] result = new int[3];

        for (int i = 0; i < 3; i++) {
           if(list[i]>list[i+1]){
           }
            if(list[i]<list[i+2]){
                result[i]=i+2;
                result[i+1]=i;
                result[i+2]=i+1;
            }
            else if(list[i]>list[i+2]){
                result[i]=i;
                if(list[i+1]>list[i+2]){
                    result[i+1]=i+1;
                    result[i+2]=i+2;
                }
            }
            else if(list[i+2]>list[i+1]){
                if(list[i+2]>list[i]){
                    result[i]=i+2;
                    if(list[i]>list[i+1]){
                        result[i+1]=i;
                        result[i+2]=i+1;
                    }
                }

            }

        }
        ArrayList<Integer> Arrry = new ArrayList<>();

        for (int i = 0; i < result.length; i++) {
            Arrry.add(result[i]);

        }

        for (int i = 0; i < Arrry.size(); i++) {
           if(Arrry.get(i)==0){
               Arrry.remove(i);
           }

        }


return Arrry;



    }

    public static void main(String[] args) {
        수포자 temp = new 수포자();
        int[] answer = {1,2,3,4,5};
        temp.solution(answer);

    }
}
