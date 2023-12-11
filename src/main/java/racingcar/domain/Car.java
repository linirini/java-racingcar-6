package racingcar.domain;

public class Car {

    private static final String MOVE = "-";
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
