class Solution {
    public int lcm(int a, int b) {
        // code here
        int lcm1=(a*b)/gcd(a,b);
        return lcm1;
        
    }
    public int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}