class Solution {
    public boolean checkIfExist(int[] arr) {
        int i=0;
        int j=1;
        while(i<arr.length)
        {
            
            
            if(j>=arr.length)
            {
                i++;
                j=0;
                continue;
            }
             if(arr[i]*2==arr[j] && i!=j)
            {
                return true;
            }
            j++;
        }
        return false;
    }
}