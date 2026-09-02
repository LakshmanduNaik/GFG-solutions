class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        int ans=arr[k-1];
        return ans;
    }
}
