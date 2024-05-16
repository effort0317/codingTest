package level1;


import java.util.*;

public class codingTest18 {
    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        int n = 125;
        System.out.println("The answer is "+solution18.solution(n));
//        System.out.println("start");
//        for(int i:solution16.solution(N,stages)){
//            System.out.println(i);
//        }
//        System.out.println("end");
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>3진법 뒤집기
class Solution18 {
    public int solution(int n) {
        int answer = 0;
        List<Integer> nList = new ArrayList<>();

        while(n !=0){
            nList.add(new Integer(n%3));
            n /= 3;
        }

        int three = 1;
        for(int i=nList.size()-1;i>=0;i--){
            answer += nList.get(i)*three;
            three *=3;
        }
        return answer;
    }
}