package practice;
//number hashing supports for upto 10 to the power 7 size only

import java.util.HashMap;

public class Hash_Map {
    void hashfunct(int target,int array[]) {
        HashMap<Integer, Integer>map=new HashMap<>();
        for (int i=0 ;i< array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
            else {
                map.put(array[i], 1);
            }
        }
        System.out.println(map);

        System.out.println("frequency os the given target is"+map.get(target));

    }



}
