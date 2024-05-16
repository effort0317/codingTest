package level1;


public class codingTest22 {
    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();

        System.out.println("The answer is "+solution22.solution(12));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>나머지가 1이 되는 수 찾기
class Solution22 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<n;i++){
            if(n%i ==1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}