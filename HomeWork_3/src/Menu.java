import validators.InputParamsMenuValidator;

public class Menu {
    public static void inventoryMenu()
    {
        System.out.printf("Виберіть операцію:%n"
                + "[1] Додати %n"
                + "[2] Видалити %n"
                + "[3] Вивести всі продукти%n"
                + "[4] Вивести загальні ціну%n"
                + "[5] Вийти%n");

        switch (new InputParamsMenuValidator().inputCorrected())
        {
            case 1:
                choiceProductAdd();
                break;
            case 2:
                choiceProductRemove();
                break;
            case 3:
                InventoryOperation.showInventory();
                break;
            case 4:
                InventoryOperation.totalPrice();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
    public static void choiceProductAdd()
    {
        System.out.printf("Виберіть тип продукту:%n"
                + "[1] Fruits%n"
                + "[2] Juice%n"
                + "[3] Vegetables%n");

        switch (new InputParamsMenuValidator().inputCorrected())
        {
            case 1 : InventoryOperation.addFruits();
                break;
            case 2 : InventoryOperation.addJuices();
                break;
            case 3 : InventoryOperation.addVegetables();
                break;
        }
    }
    public static void choiceProductRemove()
    {
        System.out.printf("Виберіть тип продукту:%n"
                + "[1] Fruits%n"
                + "[2] Juice%n"
                + "[3] Vegetables%n");

        switch (new InputParamsMenuValidator().inputCorrected())
        {
            case 1 : InventoryOperation.removeFirstFruits();
                break;
            case 2 : InventoryOperation.removeFirstJuice();
                break;
            case 3 : InventoryOperation.removeFirstVegetables();
                break;
        }
    }
}
