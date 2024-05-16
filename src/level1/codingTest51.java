package level1;

import java.lang.Math;

public class codingTest51 {
    public static void main(String[] args) {
        int answer = Solution51.solution(5, 3,2);

        System.out.println(answer);
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 기사단원의 무기
class Solution51 {
    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1;i<=number;i++){
            int divisorCnt = getDivisorCnt(i);

            if(divisorCnt > limit){
                divisorCnt = power;
            }

            answer += divisorCnt;
        }
        return answer;
    }
    private static int getDivisorCnt(int number){
        int count = 0;
        int sqrt = (int)Math.sqrt(number);

        for(int j=1;j<=sqrt;j++){
            if(number%j == 0){
                count++;
                if(Math.pow(j,2) < number){
                    count++;
                }
            }
        }

        return count;
    }
}