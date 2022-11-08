// 선택 정렬 알고리즘으로  시간 복잡도는 O(n^2)
// 왼쪽부터 오름차순 
#include <stdio.h>

int main(){
    int i, j, min, index, temp;
    int array[10] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

	printf("정렬 전 : [");
    for(i=0; i<10; i++){
        printf("%d ", array[i]);
    }
    printf("]\n");

    for(i=0; i<10; i++){      // array 길이만큼 반복
        min = 100;                      // 제일 큰 값 삽입
        for(j=i; j<10; j++){  // 비교 원소
            if(array[j] < min){          // min > 비교 원소
                min = array[j];          // min에 비교원소 삽입
                index = j;               // 비교원소의 index값 저장
            }
        }
        temp = array[index];                 // 비교 원소를 앞으로 위치
        array[index] = array[i];
        array[i] = temp;
    }
    
    printf("정렬 후 : [");
    for(i=0; i<10; i++){
        printf("%d ", array[i]);
    }
    printf("]\n");
}
