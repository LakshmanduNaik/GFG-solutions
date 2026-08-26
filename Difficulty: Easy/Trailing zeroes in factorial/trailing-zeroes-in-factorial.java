class Solution {
    public static int trailingZeroes(int n) {
        // code here
        int count=0;
        int d=5;
        while((n/d)!=0)
        {
            count+=(n/d);
            d*=5;
        }
        return count;

    }
}