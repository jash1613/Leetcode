class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int h=people.length-1;
        int c=0;
        while(l<=h)
        {
              int sum=people[l]+people[h];
              if(sum<=limit)
              {
                l++;
                
               
              }
               c=c+1;
              h--;
              
         }
         return c;
        }
        
    }
