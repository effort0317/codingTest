package level1;

public class codingTest5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println("The answer is "+solution5.solution(numbers,hand));
    }
}
// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>키패드 누르기
class Solution5 {
    public String solution(int[] numbers, String hand) {
       String answer = "";
       int lFinger = 10; // 위치상 *를 10이라고 간주
       int rFinger = 12; // 위치상 #을 12라고 간주

        for(int i=0; i<numbers.length;i++){
            if(numbers[i]==0)numbers[i]=11; // 눌러야할 숫자가 0일 시 위치상 11이라고 간주

            if(numbers[i]%3==1){ // 1, 4 ,7
                answer = answer+"L";
                lFinger = numbers[i];
            }else if(numbers[i]%3==0){ // 3, 6, 9
                answer = answer+"R";
                rFinger = numbers[i];
            }else
            {   // 2, 5, 8, 0
                int lDist = 0; // 눌러야할 숫자와 왼손 손가락 사이 거리 구하기
                if (lFinger%3 ==2){
                    lDist = Math.abs((numbers[i] - lFinger) / 3);
                } else {
                    lDist = Math.abs((numbers[i] - (lFinger + 1)) / 3);
                    lDist++;
                }

                int rDist = 0; // 눌러야할 숫자와 오른손 손가락 사이 거리 구하기
                if (rFinger%3 == 2){
                    rDist = Math.abs((numbers[i] - rFinger) / 3);
                } else {
                    rDist = Math.abs((numbers[i] - (rFinger - 1)) / 3);
                    rDist++;
                }

                if ((lDist - rDist) < 0) {
                    answer = answer + "L";
                    lFinger = numbers[i];
                } else if ((rDist - lDist) < 0) {
                    answer = answer + "R";
                    rFinger = numbers[i];
                } else if ((rDist - lDist) == 0) {
                    if (hand.equals("right")) {
                        answer = answer + "R";
                        rFinger = numbers[i];
                    } else if (hand.equals("left")) {
                        answer = answer + "L";
                        lFinger = numbers[i];
                    }
                }

            }
        }
        return answer;
    }
}
