package level1;

import java.util.*;

public class codingTest43 {
    public static void main(String[] args) {
        System.out.println(Solution43.solution(8, 4, new int[]{2, 3, 6}));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 덧칠하기
class Solution43 {
    public  static int  solution(int n, int m, int[] section) {
        Arrays.sort(section);

        int answer = 1;

        int rollerStart =section[0]; // 롤러 처음 칠할 시작
        int rollerEnd = section[0]+(m-1); // 롤러 처음 칠할 끝

        for(int i:section) {
            if (i >= rollerStart && i <= rollerEnd) {
                continue;
            } else {
                rollerStart = i;
                rollerEnd = i + (m - 1);
                answer++;
            }
        }

        return answer;
    }
}