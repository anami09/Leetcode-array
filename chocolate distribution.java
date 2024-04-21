//chocolate distribution leetcode and geeks for geeks solution 
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long res=Long.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            int min_Element=a.get(i);
            int max_Element=a.get(i+m-1);
            res=Math.min(res,max_Element-min_Element);
        }   
        return res;
    }
}
