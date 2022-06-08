package programmers;

public class 약수의개수덧셈 {

    public static int solution(int left, int right) {
        int answer = 0;
        int check=0;

        for(int i=left; i<=right; i++) {
            check=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.println("i="+i+"j="+j);
                    check++;
                }
            }
            //check가 짝수면
            if (check % 2 == 0) {
                answer += i;
                System.out.println(i);
            }
            else{answer+=-i;}
        }


        return answer;
    }
    public static void main(String[] args) {
        solution(24,27);

    }
}
