package racingcar.view;

public enum InputEnum {
    CAR_NAME_INPUT("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    TRY_NUMBER_INPUT("시도할 횟수는 몇회인가요?");
    private String message;

    InputEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
