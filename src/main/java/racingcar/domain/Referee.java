package racingcar.domain;

public class Referee {

    public Winners determineWinners(Cars cars) {
        return new Winners(cars.findCarNamesWithMaxForwardCount());
    }

}
