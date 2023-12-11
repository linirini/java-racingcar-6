package racingcar.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static racingcar.view.InputEnum.CAR_NAMES_INPUT;
import static racingcar.view.InputEnum.TRY_NUMBER_INPUT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public String inputTryNumber() {
        System.out.println(TRY_NUMBER_INPUT.getMessage());
        String input = readLine();
        return input;
    }

    public List<String> inputCars() {
        System.out.println(CAR_NAMES_INPUT.getMessage());
        String input = readLine();
        return Arrays.stream(input.split(",")).collect(Collectors.toList());
    }

}
