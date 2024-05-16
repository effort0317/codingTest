package level1;


import java.util.*;

public class codingTest32 {
    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();

        System.out.println(solution32.solution("AZbcdefg"));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 문자열 내림차순으로 배치하기
class Solution32 {
    public String solution(String s) {
        String[] array = new String[s.length()];

        for(int i=0;i<s.length();i++){
            array[i] = s.substring(i,i+1);
        }
        Arrays.sort(array, Collections.reverseOrder());

        String answer = "";
        for(int i=0;i<array.length;i++){
            answer += array[i];
        }

        return answer;
    }
}