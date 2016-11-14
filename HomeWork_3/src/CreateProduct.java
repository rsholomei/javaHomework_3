import product.Fruits;
import product.Juice;
import product.Vegetables;
import validators.InputParamsProductValidator;

import java.util.Scanner;

public class CreateProduct {
    Scanner scanner = new Scanner(System.in);

    public Juice initializationJuice()
    {
        Juice juice = new Juice();
        System.out.println("Введіть назву соку:");
        juice.nameProduct = scanner.next();

        System.out.println("Введіть ціну соку:");
        InputParamsProductValidator.inputParamsValidator();
        juice.priceProduct = InputParamsProductValidator.inputCorrectedParams();

        System.out.println("Введіть кількість соку:");
        InputParamsProductValidator.inputParamsValidator();
        juice.quantity = InputParamsProductValidator.inputCorrectedParams();
        return juice;
    }
    public Fruits initializationFruits()
    {
        Fruits fruits = new Fruits();
        System.out.println("Введіть назву фруктів:");
        fruits.nameProduct = scanner.next();

        System.out.println("Введіть ціну фруктів:");
        InputParamsProductValidator.inputParamsValidator();
        fruits.priceProduct = InputParamsProductValidator.inputCorrectedParams();

        System.out.println("Введіть кількість фруктів:");
        InputParamsProductValidator.inputParamsValidator();
        fruits.quantity = InputParamsProductValidator.inputCorrectedParams();
        return fruits;
    }
    public Vegetables initializationVegetables()
    {
        Vegetables vegetables = new Vegetables();
        System.out.println("Введіть назву овочів:");
        vegetables.nameProduct = scanner.next();

        System.out.println("Введіть ціну овочів:");
        InputParamsProductValidator.inputParamsValidator();
        vegetables.priceProduct = InputParamsProductValidator.inputCorrectedParams();

        System.out.println("Введіть кількість овочів:");
        InputParamsProductValidator.inputParamsValidator();
        vegetables.quantity = InputParamsProductValidator.inputCorrectedParams();
        return vegetables;
    }
}
