package baekJoon;

import java.util.*;

public class programmers {
    public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int [id_list.length];
            int index=-1;

        HashSet<String> report_1 = new HashSet<>();
        for (String List : report){
            report_1.add(List);
            System.out.println(report_1);
        }
        List<String> report_2 = new ArrayList<>(report_1);

            for(String id:id_list){
                int mailNum=0;
                ++index;
                System.out.println(id+"가 신고한 내역!");


                for (int i=0; i< report_2.size();i++){
                    int check =0;
                    String[] report_split = report_2.get(i).split(" ");
                    //System.out.println(id +"  vs  "+report_split[0]+"  "+report_split[1]);
                    if (id.equals(report_split[0])){
                        System.out.println(report_split[0]+"=>"+report_split[1]); // muzi frodo -> 무지가 프로도 신고함

                        //신고 당한 사람 몇번 당했는지 알아보는 로직
                        for (int j=0; j< report_2.size();j++){ //전체를 돌면서
                            String[] report_split_chcked = report_2.get(j).split(" "); //frodo가 몇번 당했는지 확인
                            if(report_split[1].equals(report_split_chcked[1])){
                                check++;

                                System.out.println(report_split[1]+"은"+check+"번 신고당함");
                                if(check>=k){
                                    mailNum++;
                                }
                            }

                        }


                    }


                }
//            System.out.println(check);

                System.out.println(id + "=" + mailNum);
                answer[index]=mailNum;

                System.out.println("---------------------");


            }
//



            return answer;

        }



    public static void main(String[] args) {

        String [] id_list = {"con", "ryan"};
       // String [] id_list ={"muzi", "frodo", "apeach", "neo"};
        String [] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
       //String [] report ={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        programmers temp = new programmers();
        temp.solution(id_list,report,k);

    }
}
