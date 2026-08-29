class Solution {
    public static int firstDigit(int n) {
        // code here
        int t=n;
        if(t<=9) return t;
        while(t>9)
        {
            int d=t%10;
            t/=10;
        }
        return t;
    }
}