package racingcar.view;

import static racingcar.view.OutputEnum.MOVEMENT_OUTPUT;
import static racingcar.view.OutputEnum.RESULT_OUTPUT;
import static racingcar.view.OutputEnum.WINNERS_OUTPUT;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Winners;

public class OutputView {

    public void printResult(){
        System.out.println(RESULT_OUTPUT.getMessage());
    }

    public void printCarMovement(Cars cars){
        for (Car car : cars.getCarsInfo()) {
            System.out.println(MOVEMENT_OUTPUT.getMovementOutput(car.getName(), car.getMovement()));
        }
    }

    public void printWinners(Winners winners){
        System.out.println(WINNERS_OUTPUT.getWinnersOutput(winners.getWinners()));
    }

    public void printLineBreak(){
        System.out.println();
    }

}
