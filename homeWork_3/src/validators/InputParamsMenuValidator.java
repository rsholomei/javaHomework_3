package validators;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputParamsMenuValidator {
    boolean flag;
    private String correctedP;
    public boolean validator()
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Pattern pattern = Pattern.compile("[1-5]");
        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches())
        {
            flag = false;
            System.out.println("Некоректне введення. Спробуйте ще:");
        }else {
            flag = true;
            correctedP = input;
        }
        return flag;
    }
    public void inputParams()
    {
        while (!flag)
        {
            validator();
        }
    }

    public Integer inputCorrected()
    {
        inputParams();
        return Integer.parseInt(correctedP);
    }
}
