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
                h--;
                c=c+1;
              }
              else if(sum>limit)
              {
                    int temp=Math.max(people[l],people[h]);
                    if(temp==people[l] && temp<=limit)
                    {
                             l++;
                             c=c+1;
                    }
                    else if(temp==people[h] && temp<=limit)
                    {
                      h--;
                      c=c+1;
                    }
              }
        }
        return c;
    }
}