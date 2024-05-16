package level1;

import java.util.ArrayList;
import java.util.List;

public class codingTest10 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        int[] nums = {1,2,3,4};
        System.out.println("The answer is "+solution10.solution(nums));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>소수만들기
class Solution10 {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for(int i=0;i< nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k< nums.length;k++){

                    sum = nums[i]+nums[j]+nums[k];
                    answer++;

                    for(int l=2; l< sum; l++){
                        if(sum % l == 0){
                            answer--;
                            break;
                        }
                    }
                }
            }
        }

        return answer;
    }
}