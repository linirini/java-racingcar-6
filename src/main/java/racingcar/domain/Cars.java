package racingcar.domain;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final HashMap<Car, Integer> cars;

    public Cars(List<Car> cars) {
        validate();
        this.cars = initCarsForwardCount(cars);
    }

    private void validate() {
    }

    private HashMap<Car, Integer> initCarsForwardCount(List<Car> cars) {
        return null;
    }

    public List<Car> getCarsInfo(){
        return cars.keySet().stream().collect(Collectors.toList());
    }

}
