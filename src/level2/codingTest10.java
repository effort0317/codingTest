package level2;


import java.util.*;

public class codingTest10 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();

        System.out.println(solution10.solution(new int[]{4, 1, 2, 1}, 4));
    }
}


// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>타겟 넘버
class Solution10 {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);

        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){ // 마지막 노드 까지 탐색한 경우
            if(target == sum) answer++;
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]); // 해당 노드의 값을 더하고 다음 깊이 탐색
            dfs(numbers, depth + 1, target, sum - numbers[depth]); // 해당 노드의 값을 빼고 다음 깊이 탐색
        }
    }
}