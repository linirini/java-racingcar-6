package racingcar.domain;

import static racingcar.utils.ExceptionEnum.INVALID_NAME_LENGTH;

public class Car {

    private static final int MAX_LENGTH = 5;
    private final RandomNumberGenerator numberGenerator = new RandomNumberGenerator();
    private final String name;
    private int forwardCount;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.forwardCount = 0;
    }

    private void validate(String name) {
        throwIfInvalidNameLength(name);
    }

    private void throwIfInvalidNameLength(String name) {
        if(name.length()>MAX_LENGTH){
            throw new IllegalArgumentException(INVALID_NAME_LENGTH.getMessage());
        }
    }

    public int move(){
        int moveCount = numberGenerator.createRandomNumber();
        return moveCount;
    }

    public boolean isMovingForward(){
        return false;
    }

    public String getName() {
        return name;
    }

}
