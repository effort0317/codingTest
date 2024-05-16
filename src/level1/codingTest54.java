package level1;


public class codingTest54 {
    public static void main(String[] args) {
        String answer = Solution54.solution(new int[]{1, 3, 4, 6});

        System.out.println(answer);
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 푸드 파이터 대회
class Solution54 {
    public static String solution(int[] food) {
        String answer = "";

        for(int i=1; i < food.length; i++){
            int j=food[i];
            if(j%2==1) j--;
            for(int count=0; count<(j/2); count ++){
                answer +=Integer.toString(i);
            }
        }

        String reverseAnswer = reverseString(answer);

        answer +="0";
        answer += reverseAnswer;
        return answer;
    }

    private static String reverseString(String string){
        String answer = "";
        for(int idx=string.length()-1; idx > -1; idx--){
            answer += string.charAt(idx);
        }
        return answer;
    }
}