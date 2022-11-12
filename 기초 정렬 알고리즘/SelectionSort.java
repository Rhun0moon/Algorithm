public class SelectionSort{	
	public static void main(String[] args) {
        int min, index=0, temp;
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.print("정렬 전 : [ ");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println("]");

        for(int i=0; i<10; i++){
            min = 100;
            for(int j=i; j<10; j++){
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        System.out.print("정렬 후 : [ ");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.print("]");

	}
}