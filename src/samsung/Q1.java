package samsung;

/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;
// double b = 1.0;
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Q1
{
    static int cnt;
    static int N;
    static boolean[][] checkList= new boolean[101][101];
    static int[][] list = new int[101][101];
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int MaxNum=0;
            cnt=0;
            N=sc.nextInt();


            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    list[i][j]=sc.nextInt();
                }
            }

            //최솟값 최댓값 찾기
            int Max = list[0][0];
            int Min = list[0][0];
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                   if(Max<list[i][j])Max=list[i][j];
                   if(Min>list[i][j])Min=list[i][j];
                }
            }
        //해수면 for문
        for (int k = 0; k <= 100; k++) {
           // System.out.println("k=="+k+"일 때");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (search(i,j,k)) {
                        cnt++;
                      //  System.out.println("cnt증가!");

                    }
                }
            }
            //result.add(cnt);
            if(MaxNum<cnt) MaxNum=cnt;

            for(int i=0; i<101; i++){
                for (int j = 0; j < 101; j++) {
                    checkList[i][j]=false;
                }
            }
            cnt = 0;
        }
            System.out.println("#" + test_case + " " + MaxNum);
            list=new int[101][101];

        }// end TestCase;

    }//end main
    static boolean search(int i, int j,int k) {
        // System.out.println("i=="+i+"  j=="+j);
        if (list[i][j] > k && !checkList[i][j]) {
            checkList[i][j] = true;
            //x축
            if (i > 0) search(i - 1, j, k);
            if (i < N ) search(i + 1, j, k);
            if (j > 0) search(i, j - 1, k);
            if (j < N) search(i, j + 1, k);

            return true;}
        else{return false;}
    }

}// end class
