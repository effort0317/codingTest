package level1;


import java.util.*;


public class codingTest28 {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();


        System.out.println("the answer is "+solution28.solution(3,9));

    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 두 정수 사이의 합
class Solution28 {
    public long solution(int a, int b) {
        long answer = 0;
        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);
        for(int i=smaller;i<bigger+1;i++){
            answer += i;
        }
        return answer;
    }
}