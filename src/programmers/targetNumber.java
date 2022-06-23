package programmers;

class targetNumber {
     static  int answer;

    public int solution(int[] numbers, int target) {
        answer =0;
        dfs(numbers,0,target,0);
        System.out.println(answer);
        return answer;
    }

    public void dfs (int[] numbers, int depth, int target, int sum){
        System.out.println("실행");
        //numbers : 알고리즘을 실행할 대상 배열
        //depth : 노드의 깊이
        // target : 타겟넘버
        // sum 이전 노드 까지의 결과 값

        if(depth == numbers.length){
            if(target == sum){
                answer++;}
        } else{
            dfs(numbers, depth+1,target, sum + numbers[depth]);
            dfs(numbers, depth+1,target, sum - numbers[depth]);
        }

    }

    public static void main(String[] args) {
        int [] numbers = new int[]{1,1,1,1};
        targetNumber temp = new targetNumber();
        int solution = temp.solution(numbers, 3);

    }
}
