package 프로그래머스;

import java.util.*;
class 폰켓몬 {
    public int solution(int[] nums) {
        Set<Integer> numsHashSet = new HashSet<>();
        for(int num : nums) {
            numsHashSet.add(num);
        }
        return numsHashSet.size() > nums.length/2 ? nums.length/2 : numsHashSet.size();
    }
}