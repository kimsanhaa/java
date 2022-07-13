package programmers;

import java.util.Locale;

public class 신규아이디추천 {
    public static void main(String[] args) {
        solution("...!@BaT#*..y.abcdefghijklm");
    }
    public static String solution(String new_id) {
        //1단계 대문자 -> 소문자
        new_id = new_id.toLowerCase(Locale.ROOT);
        //2단계 소문자, 숫자, 빼기, 밑줄 마침표를 제외한 모든 문자를 삭제
        char[] chars_1 = new_id.toCharArray();
        for (char aChar : chars_1) {
            if(aChar>='a'&&aChar<='z'||Character.isLetterOrDigit(aChar)||aChar=='-'||aChar=='_'||aChar=='.')continue;
            else{new_id=new_id.replace(aChar,' ');}
        }
        new_id=new_id.replace(" ","");
        //3단계
        System.out.println(new_id);
        String answer = "";
        return answer;
    }
}
