class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int n=arr.length;
        int i=0;
        int index=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                index=i;
                return index;
            }
        }
        return -1;

    }
}