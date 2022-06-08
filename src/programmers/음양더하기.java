package programmers;

public class 음양더하기{
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
           int num = absolutes[i];
            if(signs[i]==false){
               num=num*-1;
           }
            answer += num;
        }

            return answer;
    }
    public static void main(String[] args) {
        음양더하기 temp = new 음양더하기();
        int [] absolutes = new int[]{4,7,12};
        boolean [] signs = new boolean[]{true,false,true};
        temp.solution(absolutes,signs);

    }

}
