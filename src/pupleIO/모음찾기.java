package pupleIO;

public class 모음찾기 {
    public int Solution (String str){
        char [] charArr = str.toCharArray();
        int count =0;

        for (char c : charArr) {
            if(c==97 || c==105 || c==111 || c==117 || c==101) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        모음찾기 temp = new 모음찾기();
        String str = "abracadabra";
        int answer = temp.Solution(str);
        System.out.println(answer);

    }
}
