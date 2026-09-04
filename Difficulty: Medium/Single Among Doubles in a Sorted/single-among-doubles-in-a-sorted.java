class Solution {
    int single(int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr)
        {
            if(set.contains(i))
            {
                set.remove(i);
            }else
            {
                set.add(i);
            }
        }
        for(int i:set)
        {
            return i;
        }
        return -1;
    }
}