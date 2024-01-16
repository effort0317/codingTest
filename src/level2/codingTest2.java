package level2;


public class codingTest2 { // 쉽지않다 ㅎㅎㅎㅎ
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int n = 0;

        System.out.println("The answer is "+solution2.solution(n));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>124나라의숫자
class Solution2 {
    public String solution(int n) {
        String answer = "";

        while(n>0){
            if (n % 3 == 0){
                answer = "4"+answer;
                n--; // 자릿수 바뀜
            }else if(n % 3 == 1){
                answer = "1"+answer;
            }else{
                answer = "2"+answer;
            }
            n /=3;
        }

        return answer;
    }
}