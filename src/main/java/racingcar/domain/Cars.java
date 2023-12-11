package racingcar.domain;

import java.util.HashMap;
import java.util.List;

public class Cars {

    private final HashMap<Car, Integer> cars;

    public Cars(List<Car> cars) {
        validate();
        this.cars = initCarsForwardCount(cars);
    }

    private void validate() {
    }

    private HashMap<Car, Integer> initCarsForwardCount(List<Car> cars) {

    }


}
