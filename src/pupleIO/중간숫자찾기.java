package pupleIO;

public class 중간숫자찾기 {
    public int Solution (int [] list){
        int a = list[0];
        int b= list[1];
        int c= list[2];

        if(a>=b){
            if(b>=c) return b;
            else if(a<=c) return a;
            else{return c;}
        }
        else if (a>c) return a;
        else if (b>c) return c;
        else{return b;}
    }

    public static void main(String[] args) {
        중간숫자찾기 temp = new 중간숫자찾기();
        int [] list = new int[]{5,1,2};
        int answer = temp.Solution(list);
        System.out.println(answer);
    }

}
