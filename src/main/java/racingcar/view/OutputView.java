package racingcar.view;

import static racingcar.view.OutputEnum.MOVEMENT_OUTPUT;
import static racingcar.view.OutputEnum.RESULT_OUTPUT;
import static racingcar.view.OutputEnum.WINNERS_OUTPUT;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Winners;

public class OutputView {

    private static final String MOVE = "-";

    public void printResult(){
        System.out.println(RESULT_OUTPUT.getMessage());
    }

    public void printCarMovement(String name, int moveCount){
        System.out.println(MOVEMENT_OUTPUT.getMovementOutput(name, getMovement(moveCount)));
    }

    private String getMovement(int moveCount){
        String move = "";
        for (int i = 0; i < moveCount; i++) {
            move = move+MOVE;
        }
        return move;
    }

    public void printWinners(Winners winners){
        System.out.println(WINNERS_OUTPUT.getWinnersOutput(winners.getWinners()));
    }

    public void printLineBreak(){
        System.out.println();
    }

}
