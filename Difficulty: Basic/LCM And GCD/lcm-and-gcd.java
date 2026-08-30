class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int g=gcd(a,b);
         int lcm1=(a*b)/g;
        return new int[]{lcm1,g};
        
    }
    public static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    
}