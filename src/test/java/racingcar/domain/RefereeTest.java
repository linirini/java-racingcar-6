package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RefereeTest {

    private Referee referee;

    @BeforeEach
    void init() {
        referee = new Referee();
    }

    @DisplayName("우승자 목록을 반환한다.")
    @Test
    void 우승자_판별() {
        List<String> carNames = List.of("가", "나", "다");
        Cars cars = new Cars(carNames);
        cars.getCars().get(0).move(2);
        cars.getCars().get(0).move(3);
        cars.getCars().get(1).move(0);
        cars.getCars().get(2).move(2);
        cars.getCars().get(2).move(9);
        Winners winners = referee.determineWinners(cars);
        assertThat(winners.getWinners()).isEqualTo("다");
    }

}