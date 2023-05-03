package arrays;

import java.util.HashMap;

public class OccurrenceOfEachNo {

    public HashMap<Integer,Integer> occurrenceOfIntUsingCollection(int[] arr){
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i:arr){
            if (hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i)+1);
            }
            else
                hashMap.put(i,1);
        }
        return hashMap;

    }

}
