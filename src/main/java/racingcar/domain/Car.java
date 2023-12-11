package racingcar.domain;

public class Car {

    private final String name;
    private int movement;

    public Car(String name) {
        this.name = name;
    }

    public int move(){
        return -1;
    }

    public boolean isMovingForward(){
        return false;
    }

}
