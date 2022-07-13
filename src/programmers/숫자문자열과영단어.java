package programmers;

import java.util.HashMap;

public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        solution(s);


    }
    public static int solution(String s) {
        HashMap<String,String> hashMap = new HashMap<>();
     hashMap.put("zero","0");
    hashMap.put("one","1");
    hashMap.put("two","2");
    hashMap.put("three","3");
    hashMap.put("four","4");
    hashMap.put("five","5");
    hashMap.put("six","6");
    hashMap.put("seven","7");
    hashMap.put("eight","8");
    hashMap.put("nine","9");
        for (String s1 : hashMap.keySet()) {
            s=s.replace(s1,hashMap.get(s1));
        }

        System.out.println(s);
        int answer = Integer.parseInt(s);
        return answer;
    }
}
