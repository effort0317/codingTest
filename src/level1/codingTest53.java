package level1;

import java.util.*;

public class codingTest53 {
    public static void main(String[] args) {
        int answer = Solution53.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});

        System.out.println(answer);
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 과일장수
class Solution53 {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] scoreInteger = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreInteger, Collections.reverseOrder());

        if(scoreInteger.length >= m){
            int count = scoreInteger.length/m;

            for(int i=0; i<count; i++){
                int idx = i*m+(m-1);

                answer += scoreInteger[idx]*m;
            }
        }

        return answer;
    }
}