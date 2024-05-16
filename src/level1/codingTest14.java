package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class codingTest14 {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        int[] answer = {1,3,2,4,2};

        System.out.println("The answer is ");
        for(int i : solution14.solution(answer)){
            System.out.println(i);
        }
        System.out.println("end");
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>모의고사
class Solution14 {
    public int[] solution(int[] answers) {
        List<Integer> answerList = new ArrayList<>();
        int answer = firstCnt(answers);
        int tempAnswer = secondCnt(answers);


        if(answer < tempAnswer){
            answerList.add(2);
            answer = tempAnswer;
        }else if(answer > tempAnswer){
            answerList.add(1);
        } else if(answer==tempAnswer){
            answerList.add(1);
            answerList.add(2);
        }

        tempAnswer = thirdCnt(answers);
        if(answer <= tempAnswer){
            if(answer < tempAnswer){
                answerList.removeAll(answerList);
            }
            answerList.add(3);
        }
        int[] answerArray = new int[answerList.size()];
        for(int i=0; i<answerArray.length; i++){
            answerArray[i] = answerList.get(i);
        }
        return answerArray;
    }
    public int firstCnt(int[] answers){
        int count = 0;
        int[] firstAnswer = {1,2,3,4,5};

        for(int i=0;i< (answers.length+4)/5;i++){
            for(int j=0; j<5; j++){
                if(answers[5*i+j] == firstAnswer[j]) {
                    count++;
                }
                if(5*i+j == answers.length-1) break;
            }
        }
        return count;
    }
    public int secondCnt(int[] answers){
        int count = 0;
        int[] secondAnswer = {2, 1, 2, 3, 2, 4, 2, 5};

        for(int i=0;i< (answers.length+7)/8;i++){
            for(int j=0; j<8; j++){
                if(answers[8*i+j] == secondAnswer[j]){
                    count++;
                }
                if(8*i+j == answers.length-1) break;
            }
        }
        return count;
    }
    public int thirdCnt(int[] answers){
        int count = 0;
        int[] thirdAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for(int i=0;i< (answers.length+9)/10;i++){
            for(int j=0; j<10; j++){
                if(answers[10*i+j] == thirdAnswer[j]){
                    count++;
                }
                if(10*i+j == answers.length-1) break;
            }
        }
        return count;
    }
}