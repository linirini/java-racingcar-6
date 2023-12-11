package racingcar.view;

import java.util.List;

public enum OutputEnum {
    RESULT_OUTPUT("실행 결과"),
    MOVEMENT_OUTPUT(" : "),
    WINNERS_OUTPUT("최종 우승자 : ");
    private String message;

    OutputEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getMovementOutput(String carName, String movement){
        return carName + MOVEMENT_OUTPUT.message + movement;
    }

    public String getWinnersOutput(String winners){
        return WINNERS_OUTPUT.message + winners;
    }

}
