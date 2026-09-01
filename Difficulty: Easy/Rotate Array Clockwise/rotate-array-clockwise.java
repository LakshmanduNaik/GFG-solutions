class Solution {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int n=arr.length;
            k=k%n;
            reverse(arr,0,n-1);
             reverse(arr,0,k-1);
            reverse(arr,k,n-1);
        }
        public static void reverse(int[] arr,int i,int j)
        {
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