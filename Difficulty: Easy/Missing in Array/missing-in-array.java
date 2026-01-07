class Solution {
    int missingNum(int arr[]) {
        int j=arr.length+1;
        int sum=0;
        int count=0;
        for(int i=0;i<j-1;i++){
            sum+=arr[i];
            
        }
        for(int i=1;i<=j;i++){
            count+=i;
            
        }
        return count-sum;
        
    }
}