class Solution {
    public int getSingle(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=0;
        for(int i:map.keySet())
        {
            if(map.get(i)==1)
            {
               res=i;
            }
        }
        return res;
    }
}