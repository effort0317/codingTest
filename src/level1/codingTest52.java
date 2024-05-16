package level1;

import java.util.*;

public class codingTest52 {
    public static void main(String[] args) {
        int answer = Solution52.solution(new String[]{"muzi", "ryan", "frodo", "neo"}
                , new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"});

        System.out.println(answer);
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 가장 많이 받은 선물
class Solution52 {
    public static int solution(String[] friends, String[] gifts) {
        Map<String, Integer> takeMap = new HashMap<>(); // friend당 다음 달에 받을 선물 개수 map
        Map<String, Map<String, Integer>> gaveMap = new HashMap<>(); // friend당 이번 달까지 준 선물 개수 map
        Map<String, Integer> giftIndexMap = new HashMap<>(); // friend당 선물지수 map

        for(String friend : friends) {
            takeMap.put(friend, 0);
            gaveMap.put(friend, new HashMap<>());
            giftIndexMap.put(friend, 0);
        }

        for(String gift : gifts){
            String giver = gift.split(" ")[0];
            String taker = gift.split(" ")[1];

            gaveMap.get(giver).put(taker, gaveMap.get(giver).getOrDefault(taker,0)+1);

            giftIndexMap.put(giver,giftIndexMap.getOrDefault(giver,0)+1);
            giftIndexMap.put(taker,giftIndexMap.getOrDefault(taker,0)-1);
        }

        for(String friend1 : friends){
            for(String friend2 : friends){
                if(!friend1.equals(friend2)){
                    int friend1Give = gaveMap.get(friend1).getOrDefault(friend2,0);
                    int friend2Give = gaveMap.get(friend2).getOrDefault(friend1,0);

                    if(friend1Give > friend2Give) {
                        takeMap.put(friend1, takeMap.get(friend1)+1);
                    } else if((friend1Give == friend2Give)
                            && (giftIndexMap.get(friend1) > (giftIndexMap.get(friend2)))) {
                        takeMap.put(friend1, takeMap.get(friend1)+1);
                    }

                }
            }
        }

        return Collections.max(takeMap.values());
    }
}