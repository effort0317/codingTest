package level1;


public class codingTest41 {
    public static void main(String[] args) {
        /*
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        */
        String[] park = {"OOOOO", "OOOOO", "OOSOO", "OOOOO", "OOOOO"};
        String[] routes = {"E 3", "W 3", "S 3", "N 3", "E 2", "E 1", "W 4", "W 1", "S 2", "S 1", "N 4", "N 1"};

        int[] answer = new int[2];
        answer = Solution41.solution(park, routes);

        System.out.println(answer[0]+", "+answer[1]);
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 공원 산책
class Solution41 {
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = 0;  // x좌표
        int y = 0;  // y좌표
        int height = park.length;   //공원 높이
        int width = park[0].length();    //공원 넓이

        // 현재 위치 찾기
        for(int i=0;i<park.length;i++){
            if(park[i].indexOf('S') > -1){
                x = park[i].indexOf('S');
                y = i;
                break;
            }
        }


        // 이동하기
        for(int i=0;i<routes.length;i++){
            String[] temp = routes[i].split(" ");
            String vector = temp[0];                    // 방향
            int distance =  Integer.parseInt(temp[1]);  // 이동 거리
            int currX = x;
            int currY = y;
            boolean flag = true; // 장애물이나 범위 벗어났는 지 여부

            switch(vector) {
                case "E":
                    flag = true;
                    for(int j=1;j<=distance;j++){
                        currX++;

                        // 범위 벗어났는 지 여부
                        if(currX >= width){
                            flag = false;
                            break;
                        }
                        // 장애물 만났는 지 유무
                        else if(park[currY].charAt(currX) =='X'){
                            flag = false;
                            break;
                        }

                    }
                    if (flag) {
                        x = currX;
                    }
                    break;
                case "W":
                    flag = true;
                    for(int j=1;j<=distance;j++){
                        currX--;

                        // 범위 벗어났는 지 여부
                        if(currX < 0){
                            flag = false;
                            break;
                        }
                        // 장애물 만났는 지 유무
                        else if(park[currY].charAt(currX) =='X'){
                            flag = false;
                            break;
                        }

                    }
                    if (flag) {
                        x = currX;
                    }
                    break;
                case "S":
                    flag = true;
                    for(int j=1;j<=distance;j++){
                        currY++;

                        // 범위 벗어났는 지 여부
                        if(currY >= height){
                            flag = false;
                            break;
                        }
                        // 장애물 만났는 지 유무
                        else if(park[currY].charAt(currX) =='X'){
                            flag = false;
                            break;
                        }

                    }
                    if (flag) {
                        y = currY;
                    }
                    break;
                case "N":
                    flag = true;
                    for(int j=1;j<=distance;j++){
                        currY--;

                        // 범위 벗어났는 지 여부
                        if(currY < 0){
                            flag = false;
                            break;
                        }
                        // 장애물 만났는 지 유무
                        else if(park[currY].charAt(currX) =='X'){
                            flag = false;
                            break;
                        }

                    }
                    if (flag) {
                        y = currY;
                    }
                    break;
            }

        }

        answer[0] = y;
        answer[1] = x;

        return answer;
    }
}