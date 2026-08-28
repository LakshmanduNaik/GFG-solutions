class Solution 
{
    public boolean isStrong(int n) 
    {
        // code here
        int s=0;
        int t=n;
        while(t>0)
        {
            int d=t%10;
            s+=fact(d);
            t/=10;
        }
        if(n==s) return true;
        return false;
        
    }
    public static int fact(int n)
    {
        int factor=1;
        for(int i=1;i<=n;i++)
        {
            factor*=i;
        }
        return factor;
    }
}