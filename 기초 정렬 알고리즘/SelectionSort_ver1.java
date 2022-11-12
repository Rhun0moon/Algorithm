import java.util.Scanner;
public class SelectionSort_ver1{
    public static void selectionSort(int[] arr, int len){        
        int min, index=0, temp;
        for(int i=0; i<len; i++){
            min = 100;
            for(int j=i; j<len; j++){
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

    }
    public static void numprint(int[] arr){
		System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.print("]");
	}
	
	public static void main(String[] args) {
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

        selectionSort(arr, len);

        System.out.print("\n정렬 후 : ");
        numprint(arr);

	}
}