package level1;


public class codingTest25 {
    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();
        
        System.out.println(solution25.solution("abced"));

    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 가운데 글자 가져오기
class Solution25 {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2 ==0){ // 짝수
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }else{ // 홀수
            answer = s.substring(s.length()/2,s.length()/2+1);
        }
        return answer;
    }
}