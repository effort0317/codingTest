package level1;

public class codingTest38 {
    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();

        System.out.println(solution38.solution(121));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 정수 제곱근 판별
class Solution38 {
    public long solution(long n) {
        if(Math.pow((long)Math.sqrt(n),2) == n){
            return (long)Math.pow(Math.sqrt(n)+1, 2);
        }
        return -1;
    }
}