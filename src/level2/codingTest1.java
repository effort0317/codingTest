package level2;


public class codingTest1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
//        int[] nums = {3,3,3,2,2,4};

        System.out.println("The answer is "+solution1.solution(8,12));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>멀쩡한 사각형
class Solution1 {
    public long solution(int w, int h) {
        long answer = 1;

        long wl = (long)w;
        long hl = (long)h;

        answer = (wl*hl)-((wl+hl)-gcd(wl, hl));
        // 대각선을 지나는 단위사각형 갯수 : 두변의 길이의 합 - 두 변 길이의 최대공약수
        return answer;
    }
    private static long gcd(long w, long h) { // 최대공약수 구하기
        if(h == 0) {
            return w;
        }
        return gcd(h, w%h);
    }
}