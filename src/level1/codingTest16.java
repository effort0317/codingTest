package level1;


import java.util.*;

public class codingTest16 {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        int N=4;
        int[] stages={4,4,4,4,4};
//        System.out.println("The answer is "+solution16.solution(N, stages));
        System.out.println("start");
        for(int i:solution16.solution(N,stages)){
            System.out.println(i);
        }
        System.out.println("end");
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>실패율
class Solution16 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failRate = new double[N]; // 실패율
        HashMap<Integer, Double> order = new HashMap<>(); // <스테이지-1, 해당 스테이지의 실패율>

        for(int i=0;i<N;i++){
            double reachCnt = 0; // 스테이지 도달 플레이어 수
            double notClearCnt = 0; // 스테이지는 도달했으나 클리어 못한 플레이어 수

            for(int stage : stages){
                if(i+1<=stage){
                    reachCnt++;
                    if(i+1 == stage){
                        notClearCnt++;
                    }
                }
            }
            if(reachCnt !=0){
                failRate[i] = notClearCnt/reachCnt;
            }else{
                failRate[i] = 0; // 스테이지에 도달한 유저가 없는 경우
            }

        }

        for(int i=0;i<N;i++){
            order.put(new Integer(i), new Double(failRate[i]));
        }

        Double[] wrapperFailRate = new Double[N];
        for(int i=0;i<N;i++){
            wrapperFailRate[i] = new Double(failRate[i]);
        }

        Arrays.sort(wrapperFailRate, Comparator.reverseOrder()); // 내림차순

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(wrapperFailRate[i].equals(order.get(new Integer(j)))){
                    answer[i] = j+1;
                    order.remove(new Integer(j));
                    break;
                }
            }
        }

        return answer;
    }
}