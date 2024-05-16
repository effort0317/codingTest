package level1;



public class codingTest49 {
    public static void main(String[] args) {
        int answer = Solution49.solution("aaabbaccccabba");
        System.out.println(answer);
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 문자열 나누기
class Solution49 {
    public static int solution(String s) {
        int answer = 0;

        int firstSame = 0;
        int firstDiff = 0;

        char first = ' ';
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(first==' '){
                first = c;
                firstSame++;
            } else{
                if(first == c){
                    firstSame++;
                } else{
                    firstDiff++;
                }
                if(firstSame == firstDiff){
                    first = ' ';
                    firstSame = 0;
                    firstDiff = 0;

                    answer++;
                }
            }
        }
        if(first != ' '){
            answer++;
        }

        return answer;
    }
}