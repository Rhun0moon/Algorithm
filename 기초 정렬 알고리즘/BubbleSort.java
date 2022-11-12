public class BubbleSort {
    public static void main(String[] args){
        int temp;
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.print("정렬 전 : [ ");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println("]");

        for(int i=10; i>0; i--){
            for(int j=0; j<i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("정렬 후 : [ ");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println("]");
    }
}

