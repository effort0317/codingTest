package level1;

public class codingTest37 {
    public static void main(String[] args) {
        Solution37 solution37 = new Solution37();

        System.out.println(solution37.solution(12345));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 자연수 뒤집어 배열로 만들기
class Solution37 {
    public int[] solution(long n) {
        String nString = Long.toString(n);
        int[] answer = new int[nString.length()];

        for(int i=0;i<answer.length;i++){
            answer[answer.length-1-i] = Integer.parseInt(nString.substring(i,i+1));
        }

        return answer;
    }
}