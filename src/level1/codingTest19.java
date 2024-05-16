package level1;



import java.util.Arrays;


public class codingTest19 {
    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        int[] d = {2,2,3,3};
        int budget = 10;
        System.out.println("The answer is "+solution19.solution(d, budget));

    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>예산
class Solution19 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for(int i:d){
            budget -=i;
            answer++;
            if(budget<=0) break;
        }

        if(budget<0) answer--;
        return answer;
    }
}