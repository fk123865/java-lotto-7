package lotto.domain.util;

import java.util.List;
import lotto.validator.NumberValidator;
import lotto.validator.Validator;

public final class AddBonusNumber {

    public static List<Integer> create(List<Integer> winningNumbers, String input) {
        validate(input);

        int bonusNumber = Integer.parseInt(input);
        winningNumbers.add(bonusNumber);
        return winningNumbers;
    }

    private static void validate(String input) {
        Validator<String> validator = new NumberValidator();
        validator.validate(input);
    }
}
