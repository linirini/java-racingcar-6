package racingcar.domain;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumberGenerator {

    private static final int START_NUMBER = 0;
    private static final int END_NUMBER = 9;
    private static final RandomNumberGenerator instance = new RandomNumberGenerator();

    private RandomNumberGenerator() {
    }

    public static RandomNumberGenerator getInstance() {
        return instance;
    }

    public int createRandomNumber() {
        return pickNumberInRange(START_NUMBER, END_NUMBER);
    }

}
