package level1;

public class codingTest9 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        System.out.println("The answer is "+solution9.solution(a, b));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>내적
class Solution9 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0;i<a.length;i++) {
            answer = answer+(a[i]*b[i]);
        }

        return answer;
    }
}
