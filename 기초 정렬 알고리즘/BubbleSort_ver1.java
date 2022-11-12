import java.util.Scanner;
public class BubbleSort_ver1 {
    public static void bubbleSort(int[] arr, int len){
        int temp;
        for(int i=len; i>0; i--){
            for(int j=0; j<i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void numprint(int[] arr){
		System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println("]");
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.print("배열 길이 입력 : ");
        int len = sc.nextInt();
        
        System.out.print("배열 값 입력 : ");
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("정렬 전 : ");
        numprint(arr);

        bubbleSort(arr, arr.length);

        System.out.print("정렬 후 : ");
        numprint(arr);
        
    }
}
