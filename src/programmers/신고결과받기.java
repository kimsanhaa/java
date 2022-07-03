package programmers;

import java.util.*;

public class 신고결과받기 {
    public static void main(String[] args) {
//        String [] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
//        String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        String [] id_list = new String[]{"con", "ryan"};
        String [] report = {"ryan con","ryan con","ryan con","ryan con"};

        solution(id_list,report,2);
        System.out.println("end");
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        //중복제거하고 hashSet -> array로 변환
        HashSet<String> hashSet = new HashSet<>();
        for (String s : report) {
            hashSet.add(s);
        }
        String [] list = new String[hashSet.size()];
        hashSet.toArray(list);
        //list 잘라서 넣기
        String [][] list_2= new String[hashSet.size()][2];
        for (int i = 0; i < list.length; i++) {
            list_2[i][0]=list[i].split(" ")[0];
            list_2[i][1]=list[i].split(" ")[1];
        }
        //list를 돌면서 신고 몇변 당했는지 check list hash map으로 만들기 ex) {1,2,0,2};
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : id_list) {
            map.put(s,0);
        }
        for (int i = 0; i < id_list.length;i++) {
            for(int j=0; j< list_2.length; j++) {
                if (id_list[i].equals(list_2[j][1])) {
                    map.put(id_list[i], map.get(id_list[i]) + 1);
                }
            }
        }
        //alist for문 돌면서 alist[1] 값으로 checklist 값이 k이상이면
        int [] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            for (int j = 0; j < list_2.length; j++) {
                if(id_list[i].equals(list_2[j][0])&&map.get(list_2[j][1])>=k){
                    result[i]++;
                }
            }

        }
        return result;
    }

}
