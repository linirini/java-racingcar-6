package racingcar.domain;

import static racingcar.utils.ExceptionEnum.INVALID_NAME_LENGTH;

public class Car {

    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 5;
    private static final int MINIMUM_MOVE_COUNT = 4;
    private static final String MOVE = "-";
    private final RandomNumberGenerator numberGenerator = new RandomNumberGenerator();
    private final String name;
    private int forwardCount;
    private int moveCount;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.forwardCount = 0;
    }

    private void validate(String name) {
        throwIfInvalidNameLength(name);
    }

    private void throwIfInvalidNameLength(String name) {
        if (name.length()<MIN_LENGTH||name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(INVALID_NAME_LENGTH.getMessage());
        }
    }

    public void move() {
        this.moveCount = numberGenerator.createRandomNumber();
        if (isMovingForward()) {
            this.forwardCount++;
        }
    }

    private boolean isMovingForward() {
        return moveCount >= MINIMUM_MOVE_COUNT;
    }

    public String getName() {
        return name;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public String getMovement() {
        String move = "";
        for (int i = 0; i < this.moveCount; i++) {
            move = move + MOVE;
        }
        return move;
    }

}
