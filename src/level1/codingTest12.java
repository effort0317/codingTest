package level1;

import java.util.HashMap;

public class codingTest12 {
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        int[] nums = {3,3,3,2,2,4};

        System.out.println("The answer is "+solution12.solution(nums));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>폰켓몬
class Solution12 {
    public int solution(int[] nums) {
        HashMap<Integer,String> numsMap = new HashMap<>();
        int mapCnt = 0;

        for(int num : nums){
            numsMap.put(num, "Y");
        }
        for(int numMap : numsMap.keySet()){
            mapCnt++;
        }

        if(nums.length/2 > mapCnt)
        return mapCnt;
        else return nums.length/2;
    }
}