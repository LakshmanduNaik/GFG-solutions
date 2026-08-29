class Solution {
    static int sumOfDigits(int n) {
        // code here
        int s=0;
        int t=n;
        while(t>0)
        {
            int d=t%10;
            s+=d;
            t/=10;
        }
        return s;
    }
}
