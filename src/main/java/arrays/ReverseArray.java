package arrays;

public class ReverseArray {
    /*public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6,7,8};
        ReverseArray reverseArray=new ReverseArray();
        int[] array2=reverseArray.reverseTheArray(array1);

        for (int i=0; i<array2.length; i++){
            System.out.print(array2[i]+" ");
        }
    }*/
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
