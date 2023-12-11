package racingcar.domain;

import static racingcar.utils.ExceptionEnum.DUPLICATED_NAMES;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private List<Car> cars;

    public Cars(List<String> carNames) {
        validate(carNames);
        this.cars = initCarsForwardCount(cars);
    }

    private void validate(List<String> carNames) {
        throwIfDuplicatedName(carNames);
    }

    private void throwIfDuplicatedName(List<String> carNames) {
        int uniqueNamesCount = carNames.stream().collect(Collectors.toSet()).size();
        if (carNames.size() != uniqueNamesCount) {
            throw new IllegalArgumentException(DUPLICATED_NAMES.getMessage())
        }
    }

    private HashMap<Car, Integer> initCarsForwardCount(List<Car> cars) {
        return null;
    }

}
