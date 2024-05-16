package level1;


import java.util.Arrays;
import java.util.Collections;

public class codingTest33 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();

        System.out.println(solution33.solution(3));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 짝수와 홀수
class Solution33 {
    public String solution(int num) {
        String answer = "Odd";
        if(num%2 == 0) answer="Even";
        return answer;
    }
}