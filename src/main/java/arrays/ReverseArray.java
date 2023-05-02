package arrays;

public class ReverseArray {
    public  int[] reverseTheArray(int[] arr){
        int startIndex;
        int lastIndex;

        for(startIndex=0,lastIndex=arr.length-1; startIndex<lastIndex; startIndex++,lastIndex--){
            int temp=arr[startIndex];
            arr[startIndex]=arr[lastIndex];
            arr[lastIndex]=temp;
        }
        return arr;
    }
}
