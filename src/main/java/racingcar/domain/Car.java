package racingcar.domain;

import static racingcar.utils.ExceptionEnum.INVALID_NAME_LENGTH;

public class Car {

    private static final int MAX_LENGTH = 5;
    private static final String MOVE = "-";
    private final String name;
    private int movement;

    public Car(String name) {
        validate(name);
        this.name = name;
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
        return -1;
    }

    public boolean isMovingForward(){
        return false;
    }

    public String getName() {
        return name;
    }

    public String getMovement(){
        String move = "";
        for (int i = 0; i < movement; i++) {
            move = move+MOVE;
        }
        return move;
    }

}
