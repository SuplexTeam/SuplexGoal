//중복 코드 개많음 
//그냥 for문 한번 돌고 조건 하나 추가하는게 빠를 듯 for+while (index증가) 

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<Integer> col = new ArrayList<>();
        List<String> ans = new ArrayList<>();

        int i = 0;
        int start = 0;
        while(i<nums.length) {
            if(col.size() == 0) {
                start = nums[i];
                col.add(nums[i++]); //0
                continue;
            }
            if(nums[i] - col.get(col.size()-1) != 1) { //nums[i] 
                if (col.size() == 1) {
                    ans.add(Integer.toString(col.get(col.size()-1)));
                } else {
                    ans.add(col.get(0)+"->"+col.get(col.size()-1));
                }
                col.clear();
            }
            col.add(nums[i++]); 
        }

        if (col.size() == 0) return ans;
                if (col.size() == 1) {
                    ans.add(Integer.toString(col.get(col.size()-1)));
                } else {
                    ans.add(col.get(0)+"->"+col.get(col.size()-1));
                }
        return ans;
    }
}

/**
to - be 
class Solution {
    public List<String> summaryRanges(int[] nums) {
       ArrayList<String> al=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;
            
            if(start!=nums[i]){
                al.add(""+start+"->"+nums[i]);
            }
            else{
                al.add(""+start);
            }
        }
        return al;
    }
}
*/
