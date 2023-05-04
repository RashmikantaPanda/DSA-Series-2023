package arrays;

import java.util.Arrays;

public class MoveNegativeToLeft {
    public  int[] moveNegativeWithOutSorting(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if (arr[left]>0 && arr[right]<0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            } else if (arr[left]<0 && arr[right]<0) {
                left++;
            }
            else if(arr[left]>0 &&arr[right]>0 ){
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        return arr;
    }

    public int[] moveNegativeUsingSorting(int[] arr)
    {
        Arrays.sort(arr);
        return  arr;
    }
}
