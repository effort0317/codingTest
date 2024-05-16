package level1;


import java.util.*;

public class codingTest15 { // 트릭이 많다 ㅎㅎㅎ
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
//        int[] nums = {3,3,3,2,2,4};
        int[] lost={2,4};
        int[] reserve={1,3,4};
        System.out.println("The answer is "+solution15.solution(5,lost, reserve));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>체육복
class Solution15 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int getCloths = 0; // 옷 받은 lost학생들 수(본인이 분실당했지만 여분있는 경우 포함)
        for(int r:reserve){
            reserveList.add(new Integer(r));
        }
        for(int l : lost){
            if(reserveList.contains(new Integer(l))){ // 체육복 분실한 학생 == 여유분 소유학생
                reserveList.remove(new Integer(l));
                getCloths++;
            }else{ // 체육복 분실한 학생 != 여유분 소유학생
                lostList.add(new Integer(l));
            }
        }

        for(int l : lostList){
            for(int r:reserveList){
                if((l-1 == r)||(l+1 == r)){
                    getCloths++;
                    reserveList.remove(new Integer(r));
                    break;
                }
            }
        }

        answer = n-lost.length+getCloths;
        return answer;
    }
}