//count 0's 1's 2's using Dutch national flag algorithm and time complexity O(n)
class Solution {
    public void sortcolors(int[] nums) {
      int temp;
      int lo=0;
      int hi=nums.length-1;
      int mid=0;
      while(mid<=hi) {
        switch(nums[mid]){
            case 0:{
            temp=nums[lo];
            nums[lo]=nums[mid];
            nums[mid]=temp;
            lo++;
            mid++;
            break;
        }
        case 1:{
        mid++;
        break;
        }
        case 2:{
        temp=nums[mid];
        nums[mid]=nums[hi];
        nums[hi]=temp++;
        hi--;
        break;
      } 
    }
}
    }
}
