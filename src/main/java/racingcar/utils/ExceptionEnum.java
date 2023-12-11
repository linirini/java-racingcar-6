package racingcar.utils;

public enum ExceptionEnum {
    INVALID_NAME_LENGTH("자동차 이름은 5자를 초과할 수 없습니다.");
    private static final String ERROR = "[ERROR] ";
    private String message;

    ExceptionEnum(String message) {
        this.message = ERROR + message;
    }

    public String getMessage() {
        return message;
    }
}
