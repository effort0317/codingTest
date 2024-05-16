package level2;


import java.util.Arrays;

public class codingTest14 {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();

        System.out.println(solution14.solution(new int[]{1,2},new int[]{3,4}));
    }
}


// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>최솟값 만들기
class Solution14 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0;i<A.length;i++){
            answer += A[i]*B[A.length-1-i];

        }
        return answer;
    }
}