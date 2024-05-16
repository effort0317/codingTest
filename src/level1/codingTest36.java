package level1;

import java.util.*;

public class codingTest36 {
    public static void main(String[] args) {
        Solution36 solution36 = new Solution36();

        System.out.println(solution36.solution(987));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 자릿수 더하기
class Solution36 {
    public int solution(int n) {
        int answer = 0;
        String stringN = Integer.toString(n);

        for(int i=0;i<stringN.length();i++){
            answer += Integer.parseInt(stringN.substring(i,i+1));
        }

        return answer;
    }
}