package arrays;

import java.util.HashMap;
import java.util.Map;

public class PairWIthGivenSum {
    public HashMap<Integer, Integer> pairWithSum(int[] arr, int sum){
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==sum){
                    hashMap.put(arr[i],arr[j]);
                }
            }
        }
        return hashMap;
    }

}
