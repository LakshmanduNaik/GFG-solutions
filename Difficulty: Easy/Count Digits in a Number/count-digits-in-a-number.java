class Solution {
    public static int countDigits(int n) {
        // Code here
        int count=0;
        int t=n;
        while(t>0)
        {
            int d=t%10;
            count++;
            t/=10;
        }
        return count;
    }
}
