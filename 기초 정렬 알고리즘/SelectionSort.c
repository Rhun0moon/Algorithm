// ���� ���� �˰�������  �ð� ���⵵�� O(n^2)
// ���ʺ��� �������� 
#include <stdio.h>

int main(){
    int i, j, min, index, temp;
    int array[10] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

	printf("���� �� : [");
    for(i=0; i<10; i++){
        printf("%d ", array[i]);
    }
    printf("]\n");

    for(i=0; i<10; i++){      // array ���̸�ŭ �ݺ�
        min = 100;                      // ���� ū �� ����
        for(j=i; j<10; j++){  // �� ����
            if(array[j] < min){          // min > �� ����
                min = array[j];          // min�� �񱳿��� ����
                index = j;               // �񱳿����� index�� ����
            }
        }
        temp = array[index];                 // �� ���Ҹ� ������ ��ġ
        array[index] = array[i];
        array[i] = temp;
    }
    
    printf("���� �� : [");
    for(i=0; i<10; i++){
        printf("%d ", array[i]);
    }
    printf("]\n");
}
