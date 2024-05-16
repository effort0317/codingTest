package level1;


public class codingTest46 {
    public static void main(String[] args) {
        System.out.println(Solution46.solution("1020234234111234234333442342343", "1020234234111234234333442342343"));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 크기가 작은 부분 문자열
class Solution46 {
    public static int solution(String t, String p) {
        int answer = 0;
        int tLen = t.length();
        int pLen = p.length();

        int lenGap = tLen-pLen;
        for(int i=0; i <= lenGap; i++){
            String tempT = t.substring(i,i+pLen);

            System.out.println("tempT "+tempT);
            long intTempT = Long.parseLong(tempT);
            long intP = Long.parseLong(p);
            if(intTempT <= intP) answer++;
        }

        return answer;
    }
}