import java.util.*;

class Solution {
    public ArrayList<Integer> findEvenOccurrences(int[] arr) {
        // code here
     HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr)
        {
            if(map.get(i)%2==0 && !set.contains(i))
            {
                list.add(i);
                set.add(i);
            }
        }
        if(list.isEmpty())
        {
            list.add(-1);
        }
        return list;
       
    }
}