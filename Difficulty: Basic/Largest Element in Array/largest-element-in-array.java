class Solution {
    public static int largest(int[] arr) {
        int a=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }
        return a;
        
    }
}
