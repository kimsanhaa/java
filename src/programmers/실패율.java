package programmers;

public class 실패율 {
    public static void main(String[] args) {
        int N=5;
        int [] stages = new int[]{2,1, 2, 6, 2, 4, 3, 3};
        solution(N,stages);
        System.out.println("end");
    }
    public static int[] solution(int N, int[] stages) {
        String[] answer = new String[N];
        int preNum= stages.length;
        double [][] doubleList = new double[N+1][2];

        for (int i = 1; i <=N; i++) {
            int cnt=0;
            for(int j=0; j< stages.length; j++){
                if(i==stages[j]){
                    cnt++;
                }
            }
            double st = (double)cnt/(double)preNum;
            doubleList[i][0]=i;
            doubleList[i][1]=st;

            answer[i-1]="cnt="+cnt+"나누기 //preNum"+preNum;
            preNum=preNum-cnt;
        }

        //오름차순 정렬
        for(int i=1; i< doubleList.length; i++){
            for(int j=1; j< doubleList.length-1-i; j++){
                if(doubleList[j][1]<doubleList[j+1][1]) {
                    double[] temp = doubleList[j];
                    doubleList[j]=doubleList[j+1];
                    doubleList[j+1]=temp;
                }
            }
        }

        int [] result = new int[N];
        for (int i = 1; i < doubleList.length; i++) {
            result[i-1]= (int) doubleList[i][0];
        }


        System.out.println("end");
        return result;
    }
}
