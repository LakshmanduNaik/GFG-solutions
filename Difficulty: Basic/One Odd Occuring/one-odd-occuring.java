class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int res=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr)
        {
            if(set.contains(i)) 
            {
                res-=i;
                set.remove(i);
            }
            else
            {
                res+=i;
                set.add(i);
            }
        }
        return res;
    }
}