class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr)
        {
            if(!set.contains(i))
            {
                set.add(i);
                list.add(i);
            }
        }
        return list;
        
    }
}