package level1;


import java.util.HashSet;
import java.util.Set;


public class codingTest21 {
    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();

        System.out.println("The answer is "+solution21.solution(5, 24));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>2016년
class Solution21 {
    public String solution(int a, int b) {
        int[] oneYr = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int cnt =b;
        if(a !=1){
            for(int i=0;i<a-1;i++){
                cnt +=oneYr[i];
            }
        }

        return days[cnt%7];
    }
}