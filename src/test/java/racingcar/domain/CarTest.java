package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {

    @DisplayName("숫자가 4 이상이면 전진한다.")
    @ParameterizedTest
    @ValueSource(ints={4,5,6,7,8,9})
    void 자동차_전진(int moveCount){
        Car car = new Car("자동차");
        car.move(moveCount);
        assertThat(car.getForwardCount()).isEqualTo(1);
    }

}
