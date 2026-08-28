class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int t=n;int s=0;
        while(t!=0)
        {
            int d=t%10;
            s+=(d*d*d);
            t/=10;
        }
        if(n==s) return true;
        return false;
    }
}