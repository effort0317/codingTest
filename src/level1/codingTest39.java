package level1;

import java.util.*;

public class codingTest39 {
    public static void main(String[] args) {
        Solution39 solution = new Solution39();

//        System.out.println(solution39.solution(121));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 달리기 경주
class Solution39 {
    public String[] solution(String[] players, String[] callings) {

        /* 1안, timeOut*/
        for(String calling : callings){
            for(int i=0;i< players.length; i++){
                if(players[i].equals(calling)){
                    String player = players[i-1];
                    players[i-1]=players[i];
                    players[i] = player;
                    break;
                }
            }
        }

        /* 2안, 통과 */
        HashMap<String, Integer> playersMap = new HashMap<>();
        for(int i=0;i< players.length; i++){
            playersMap.put(players[i],i);
        }

        for(String calling:callings){
            int rank = playersMap.get(calling);

            String formerPlayer = players[rank-1];

            playersMap.put(calling, rank-1);
            playersMap.put(formerPlayer, rank);

            players[rank] = formerPlayer;
            players[rank-1] = calling;
        }

        return players;
    }
}