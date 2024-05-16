package level1;

import java.util.Arrays;


public class codingTest13 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println("The answer is "+solution13.solution(array, commands));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>K번째수
class Solution13 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0;i< commands.length;i++){
            int[] tempArray = new int[array.length];

            for(int j=0;j< array.length;j++){
                tempArray[j] = array[j];
            }
            Arrays.sort(tempArray, commands[i][0]-1, commands[i][1]); // 배열 일부분 순서정렬

            answer[i] = tempArray[commands[i][0]+commands[i][2]-2];
        }

        return answer;
    }
}