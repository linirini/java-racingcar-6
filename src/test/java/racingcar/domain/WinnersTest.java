package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WinnersTest {

    @DisplayName("우승자 목록을 주어진 형식에 맞춰 반환한다.")
    @Test
    void 우승자_목록_반환() {
        String winners1 = new Winners(List.of("가")).getWinners();
        String winners2 = new Winners(List.of("가나, 나다")).getWinners();
        assertThat(winners1).isEqualTo("가");
        assertThat(winners2).isEqualTo("가나, 나다");
    }


}