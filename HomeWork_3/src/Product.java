import validators.InputParamsProductValidator;

import java.util.Scanner;

public class Product {
    public String nameProduct;
    public int priceProduct;
    public int quantity;
    Scanner scanner = new Scanner(System.in);

    public Product(){
        System.out.println("Введіть назву продукту:");
        nameProduct = scanner.next();

        System.out.println("Введіть ціну продукту:");
        InputParamsProductValidator.inputParamsValidator();
        priceProduct = InputParamsProductValidator.inputCorrectedParams();

        System.out.println("Введіть кількість продукту:");
        InputParamsProductValidator.inputParamsValidator();
        quantity = InputParamsProductValidator.inputCorrectedParams();
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public int getQuantity() {
        return quantity;
    }
}
