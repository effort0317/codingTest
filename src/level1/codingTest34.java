package level1;


public class codingTest34 {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();

        System.out.println(solution34.solution(12));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 약수의 합
class Solution34 {
    public int solution(int n) {
        if((n == 0) ||(n==1)) return n;
        int answer = n+1;

        for(int i=2;i<n;i++){
            if(n%i == 0) answer +=i;
        }
        return answer;
    }
}