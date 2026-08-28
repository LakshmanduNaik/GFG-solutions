class Solution 
{
    public boolean reachesOne(int n) 
    {
        // code here
        int s=0;
        int t=n;
        while(t>0)
        {
            int l=t%10;
            s+=(l*l);
            t/=10;
        }
        if(s==1) return true;
        else
        {
            t=s;
            s=0;
            while(t!=1  && t!=4)
            {
                while(t!=0)
                {
                    int l=t%10;
                    s+=(l*l);
                    t/=10;
                }
                t=s;
                s=0;
            }
            if(t==1) return true;
            return false;
        }
        
        
    }
};