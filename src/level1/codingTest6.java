package level1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class codingTest6 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println("The answer is "+solution6.solution(board, moves));
    }
}
// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>크레인 인형뽑기 게임
class Solution6 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> resultArray = new ArrayList<>(); // 바구니를 ArrayList로 표기

        for(int i=0; i<board.length; i++){
            List<int[]> boardList = new ArrayList<>(Arrays.asList(board[i]));


        }


        for(int i=0;i<moves.length;i++) {
//            System.out.println(board[i].length - 1);

            if((board[moves[i] - 1][board[moves[i] - 1].length - 1])!=0) {
                resultArray.add(board[moves[i] - 1][board[moves[i] - 1].length - 1]);
                if (resultArray.size() > 1) {
                    if (resultArray.get(resultArray.size() - 1).equals(resultArray.get(resultArray.size() - 2))) {
                        System.out.println("resultArray1 size is " + resultArray.size());
                        resultArray.remove(resultArray.size() - 1);
                        System.out.println("resultArray2 size is " + resultArray.size());
                        resultArray.remove(resultArray.size() - 1);

                        answer = answer + 2;
                    }
                }
                System.out.println("the answer is " + answer);
            }
        }
        return answer;
    }
}
