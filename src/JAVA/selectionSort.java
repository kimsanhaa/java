package JAVA;

public class selectionSort {

    public int [] sort (int [] list){
        int [] result = new int[]{};

        for(int i=0; i<list.length; i++){
            for (int i1 : list) {
                System.out.print(i1+",");
            }
            System.out.println(" ");
            // i=0;
            // i=1;
            int max = list[i];
            // min = list[1];
            for(int j=i;j< list.length;j++){
                if(list[j]>max){
                    max=list[j]; //제일 작은 값 - list[j] 이다.
                    list[j]=list[i];
                    list[i]=max;
                }
            }

        }





        return result;

    }
    public static void main(String[] args) {
        selectionSort temp = new selectionSort();

        int [] list = new int[]{2,1,4,3};
        temp.sort(list)
;    }
}
