package racingcar.controller;

import static racingcar.utils.ExceptionEnum.NOT_NUMBER;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Referee;
import racingcar.domain.Winners;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameManager {

    private final Referee referee = new Referee();
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void run() {
        Cars cars = inputCars();
        int tryNumber = inputTryNumber();
        runCars(tryNumber, cars);
        Winners winners = referee.determineWinners(cars);
        outputView.printWinners(winners);
    }

    private Cars inputCars() {
        return new Cars(inputView.inputCars());
    }

    private int inputTryNumber() {
        try {
            return Integer.parseInt(inputView.inputTryNumber());
        } catch (NumberFormatException NFE) {
            throw new IllegalArgumentException(NOT_NUMBER.getMessage());
        }
    }

    private void runCars(int tryNumber, Cars cars) {
        while (tryNumber != 0) {
            tryNumber--;
            outputView.printLineBreak();
            outputView.printResult();
            moveCars(cars);
        }
    }

    private void moveCars(Cars cars) {
        for (Car car : cars.getCars()) {
            car.move();
            outputView.printCarMovement(car);
            outputView.printLineBreak();
        }
    }

}
