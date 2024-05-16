package level1;


import java.util.*;

public class codingTest50 {
    public static void main(String[] args) {
        int[] answer = Solution50.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        for(int i : answer){
            System.out.println(i);
        }

    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 명예의 전당(1)
class Solution50 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> scoreList = new ArrayList<>();

        for(int i=0;i< score.length;i++){
            scoreList.add(score[i]);

            Collections.sort(scoreList, Collections.reverseOrder());
            if(scoreList.size() < k){
                answer[i] = scoreList.get(scoreList.size()-1);
            } else {
                answer[i] = scoreList.get(k-1);
            }
        }

        return answer;
    }
}