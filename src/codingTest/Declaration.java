package codingTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Declaration {
    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int [id_list.length];
        //1. 중복제거
        HashSet<String> reportSet = new HashSet<String>();
        HashMap<String,List<String>> reportMap = new HashMap<>();
        String[] reportSplit = new String[report.length];


        for(String rep : report) reportSet.add(rep);
        HashMap<String , Integer> reportNum = new HashMap<>(); // key : 이름 value : 메일 횟수

        for(String name : id_list){
            reportNum.put(name,null);
            System.out.println(reportNum);
        }

        for(String rep : reportSet) {
            for (int i=0; i<reportSplit.length; i++){
                reportSplit[i] = String.valueOf(rep.split(" "));
                System.out.println(reportSplit[i]);

            }
        }
















        return answer;

    }



    public static void main(String[] args) {

        //String [] id_list = {"con", "ryan"};
         String [] id_list ={"muzi", "frodo", "apeach", "neo"};
        //String [] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        String [] report ={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        Declaration temp = new Declaration();
        temp.solution(id_list,report,k);

        //

    }
}
