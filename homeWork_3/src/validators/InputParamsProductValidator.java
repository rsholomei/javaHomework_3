package validators;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputParamsProductValidator {

    static boolean flag;
    static private String correctedPrice;

    public static boolean inputParamsValidator()
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches())
        {
            flag = false;
            System.out.println("Некоректне введення. Спробуйте ще:");
        }else {
            flag = true;
            correctedPrice = input;
        }
        return flag;
    }
    public static void inputParams()
    {
        while (!flag)

        {
            inputParamsValidator();
        }
    }

    public static Integer inputCorrectedParams()
    {
        inputParams();
        return Integer.parseInt(correctedPrice);
    }
}
