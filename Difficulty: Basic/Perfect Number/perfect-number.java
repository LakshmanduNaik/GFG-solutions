class Solution 
{
    int isPerfect(int N) 
    {
        // code here
        int t=N;
        int sum=0;
        while(t!=0)
        {
            int lastdigit=t%10;
            sum+=fact(lastdigit);
            t/=10;

        }
        if(sum==N) return 1;
        return 0;
        
    }
    private int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
    
}