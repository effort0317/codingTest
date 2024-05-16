package level1;



import java.util.*;


public class codingTest20 {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        int[] numbers = {2,1,3,4,1};
        System.out.println("The answer is "+solution20.solution(numbers));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>두 개 뽑아서 더하기
class Solution20 {
    public int[] solution(int[] numbers) {
        Set<Integer> hashSet = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                hashSet.add(numbers[i] + numbers[j]);
            }
        }

        return hashSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}