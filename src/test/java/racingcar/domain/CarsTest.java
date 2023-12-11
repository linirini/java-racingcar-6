package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

    @DisplayName("자동차 이름을 받으면 자동차 목록을 생성한다.")
    @Test
    void 자동차_목록_생성() {
        List<String> carNames = List.of("가", "나", "다");
        assertThatNoException().isThrownBy(() -> new Cars(carNames));
        Cars cars = new Cars(carNames);
        assertThat(cars.getCars().get(0).getForwardCount()).isZero();
    }

    @DisplayName("자동차 이름이 중복되면 예외를 던진다.")
    @Test
    void 자동차_이름_중복_예외() {
        List<String> carNames = List.of("가", "가", "다");
        assertThatThrownBy(() -> new Cars(carNames)).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("가장 전진 횟수가 많은 자동차들의 이름을 반환한다.")
    @Test
    void 전진_횟수_최다_자동차_목록() {
        List<String> carNames = List.of("가", "나", "다");
        Cars cars = new Cars(carNames);
        cars.getCars().get(0).move(4);
        cars.getCars().get(0).move(4);
        cars.getCars().get(1).move(4);
        cars.getCars().get(2).move(4);
        cars.getCars().get(2).move(4);
        List<String> maxForwardCarNames = cars.findCarNamesWithMaxForwardCount();
        assertThat(maxForwardCarNames).hasSize(2).contains("가", "다");
    }

}
