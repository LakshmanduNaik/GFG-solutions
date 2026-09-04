class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
        int i=0;
        int n=arr.length;
        int j=n-1;
        while(i<j)
        {
            if(arr[i]==arr[j])
            {
                i++;
                j--;
            }else
            {
                return false;
            }
        }
        return true;
    }
}
