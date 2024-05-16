package level1;


import java.util.Locale;

public class codingTest31 {
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();

        System.out.println(solution31.solution("pPoooyY"));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 문자열 내 p와 y의 개수
class Solution31 {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;

        for(int i=0;i<s.length();i++){
            char c = s.toLowerCase().charAt(i);
            if(c == 'y')  yCnt++;
            if(c == 'p')  pCnt++;
        }
        if(yCnt != pCnt) answer = false;

        return answer;
    }
}