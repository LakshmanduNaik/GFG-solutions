class Solution {
    static boolean isPerfect(int n) {
        // code here
        int s=1;
        if(n<=1) return false;
        
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                s+=i;
                s+=n/i;
            }
        }
        return s==n;
    }
};