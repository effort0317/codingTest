package level1;


public class codingTest23 {
    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();

        System.out.println("The answer is "+solution23.solution(3,20,4));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 부족한금액계산하기
class Solution23 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

        for(int i=1;i<=count;i++){
            sum +=price*i;
        }
        answer = sum-money;
        if(answer<0) answer =0;

        return answer;
    }
}