package JAVA;

public class insertionSort {

    public static int [] insertionSort(int [] list){

    //list = {4,2,3,1};
        for(int i=1; i<list.length; i++){
            //현재 선택된 원소의 값을 임시 변수에 저장
            int target = list[i];
            // 현재 원소를 기준으로 이전 원소를 탐색하기 위한 index변수
            int prev = i-1;
            //선택된 원소가 이전 원소보다 작은 경우 까지만 반복하고 0번째 원소 까지만 비교
            System.out.println(target+"==탐색 시작 ");
            while(prev>=0 && list[prev] > target){
                System.out.println(list[prev]+"==>" + target +" 보다 큰 값 발견");
                //현재 선택된 원소가 현재 탐색중인 원소보다 작다면, 해당 원소는 다음 인덱스로 미룬다.
                list[prev+1] = list[prev];
                System.out.println("list[prev+1] = list[prev]" );
                prev--;
            }
            System.out.println("prev==>"+prev);
            list[prev+1] = target;
            System.out.println("target = " + target);
            for (int i1 : list) {
                System.out.print(i1+" ");
            }
            System.out.println("");
        }


        return list;
    }

    public static void main(String[] args) {
        int [] list = {4,2,3,1};
        insertionSort(list);


    }

}
