package level1;


public class codingTest35 {
    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();

        System.out.println(solution35.solution(new int[]{1,2,3,4}));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 평균 구하기
class Solution35 {
    public double solution(int[] arr) {
        double answer = 0;

        for(int i: arr){
            answer += (double) i;
        }

        return answer/(double)arr.length;
    }
}