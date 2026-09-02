class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
}