package pupleIO;

public class 승점구하기 {

    public int Solution(String [] score){
        int result =0;
        for (String rep : score) {
            String[] nums = rep.split(":");
            if(Integer.parseInt(nums[0])>Integer.parseInt(nums[1])){
                result +=3;
            }
            else if(Integer.parseInt(nums[0])==Integer.parseInt(nums[1])){
                result +=1;
            }
        }
        return result;
        
    }

    public static void main(String[] args) {
        승점구하기 temp = new 승점구하기();
        String []  score = new String[]{"3:1","2:2","1:3"};
        int answer = temp.Solution(score);
        System.out.println(answer);

    }
}
