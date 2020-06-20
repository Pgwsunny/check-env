package com.twschool.practice;

public class GuessNumberGame {
    public static final int MAX_TRY_TIMES = 6;
    private gameAnswer gameanswer;
    private GumeStatus gamestatus;
    private int leftTryTimes = MAX_TRY_TIMES;
    public GuessNumberGame(gameAnswer gameanswer){
        this.gameanswer = gameanswer;
    }

    public String guess(String userAnswerString) {
        String result = gameanswer.check(userAnswerString);
        leftTryTimes--;
        if("4A0B".equals(result)){
            gamestatus = GumeStatus.SUCCEED;
        } else if(leftTryTimes == 0){
            gamestatus = GumeStatus.FAILED;
        }else {
            gamestatus = GumeStatus.CONTINUE;
        }

        return result;
    }

    public GumeStatus getStatus() {
        return gamestatus;
    }
}
