package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {

    @DisplayName("숫자가 4 이상이면 전진한다.")
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    void 자동차_전진(int moveCount) {
        Car car = new Car("자동차");
        car.move(moveCount);
        assertThat(car.getForwardCount()).isEqualTo(1);
    }

    @DisplayName("숫자가 4 미만이면 전진하지 않는다.")
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void 자동차_멈춤(int moveCount) {
        Car car = new Car("자동차");
        car.move(moveCount);
        assertThat(car.getForwardCount()).isEqualTo(0);
    }

    @DisplayName("자동차 실행 상태를 형식에 맞는 문자열 형태로 반환해준다.")
    @ParameterizedTest
    @CsvSource({"1,-", "3,---", "9,---------"})
    void 자동차_상태(int moveCount, String movement) {
        Car car = new Car("자동차");
        car.move(moveCount);
        assertThat(car.getMovement()).isEqualTo(movement);
    }

}
