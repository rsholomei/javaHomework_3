import validators.InputParamsMenuValidator;

public class Menu {
    public static void inventoryMenu()
    {
        System.out.printf("Виберіть операцію:%n"
                + "[1] Додати новий продукт%n"
                + "[2] Видалити перший продукт%n"
                + "[3] Вивести всі продукти%n"
                + "[4] Вивести загальні ціну та кількість%n"
                + "[5] Вийти%n");

        switch (new InputParamsMenuValidator().inputCorrected())
        {
            case 1:
                InventoryOperation.addProduct();
                break;
            case 2:
                InventoryOperation.removeFirstProduct();
                break;
            case 3:
                InventoryOperation.show();
                break;
            case 4:
                InventoryOperation.total();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
}
