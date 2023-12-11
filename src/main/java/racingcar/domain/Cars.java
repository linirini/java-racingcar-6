package racingcar.domain;

import static racingcar.utils.ExceptionEnum.DUPLICATED_NAMES;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private List<Car> cars;

    public Cars(List<String> carNames) {
        validate(carNames);
        this.cars = convertToCars(carNames);
    }

    private void validate(List<String> carNames) {
        throwIfDuplicatedName(carNames);
    }

    private void throwIfDuplicatedName(List<String> carNames) {
        int uniqueNamesCount = carNames.stream().collect(Collectors.toSet()).size();
        if (carNames.size() != uniqueNamesCount) {
            throw new IllegalArgumentException(DUPLICATED_NAMES.getMessage());
        }
    }

    private List<Car> convertToCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public List<String> findCarNamesWithMaxForwardCount() {
        int maxCount = getMaxCount();
        List<String> carNames = new ArrayList<>();
        cars.stream().filter(car -> car.getForwardCount() == maxCount).collect(Collectors.toList())
                .forEach(car -> carNames.add(car.getName()));
        return carNames;
    }

    private int getMaxCount() {
        int maxCount = 0;
        for (Car car : cars) {
            if (car.getForwardCount() > maxCount) {
                maxCount = car.getForwardCount();
            }
        }
        return maxCount;
    }

}
