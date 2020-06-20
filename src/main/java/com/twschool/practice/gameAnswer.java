package com.twschool.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class gameAnswer {
    private final List<String> answerNumbers;

    public gameAnswer(String gameanswerString){
        this.answerNumbers = Arrays.asList(gameanswerString.split(" "));
    }

    public String check(String userAnswerString) {
        List<String> userNumbers = Arrays.asList(userAnswerString.split(" "));
        int countA = 0;
        int countB = 0;
        for (int index = 0;index < answerNumbers.size();index++){
            if(answerNumbers.get(index).equals(userNumbers.get(index))){
                countA++;
            }
        }
        for (int i = 0;i < answerNumbers.size();i++){
            for (int j = 0;j < userNumbers.size();j++)
                if(answerNumbers.get(i).equals(userNumbers.get(j)) && i != j){
                    countB++;
            }
        }
        return countA+"A" + countB + "B";
    }
}
