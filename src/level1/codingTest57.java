package level1;



public class codingTest57 {
    public static void main(String[] args) {
        System.out.println(Solution57.solution(new String[]{"aya", "yee", "u", "maa"}));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)> 코딩테스트 연습 > 옹알이(2)
class Solution57 {
    public static int solution(String[] babbling) {
        int answer = 0;

        for(String s : babbling){
            if(s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")){
                continue;
            }

            s = s.replaceAll("aya", " ");
            s = s.replaceAll("ye", " ");
            s = s.replaceAll("woo", " ");
            s = s.replaceAll("ma", " ");

            s = s.replaceAll(" ", "");

            if(s.equals("")) answer++;
        }

        return answer;
    }
}