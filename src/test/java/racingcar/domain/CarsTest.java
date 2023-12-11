package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

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

}
