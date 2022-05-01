package algorithm;

public class watermelon {
    public String solution(int n) {
        String answer = "";
        // n이 2의 배수면 n/2 값 만큼 수박을 반복
        // n이 2의 배수가 아니면 n/2하고 +수
        for(int i=1; i<=n/2;i++){
            answer = answer+"수박";
        }
        if(n%2==1){
            answer= answer+"수";
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        watermelon watermelon = new watermelon();
        //watermelon.solution(11);
        //watermelon.solution(20);
        //watermelon.solution(30);

    }
}
