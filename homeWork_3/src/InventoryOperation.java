import java.util.HashSet;
import java.util.Set;

public class InventoryOperation {

    static Set<Product> products = new HashSet<>();
    public static Product newAdd()
    {
        return new Product();
    }
    public static void addProduct()
    {
            products.add(newAdd());
    }
    public static void removeFirstProduct()
    {
        for (Product set : products)
        {
            products.remove(set);
            break;
        }
    }
    public static void show()
    {
        for (Product product : products)
        {
            System.out.println(product.getNameProduct()+" | "+product.getPriceProduct()+" | "+product.getQuantity());
        }
    }
    public static void total()
    {
        long totalQuantity = 0;
        long totalPrice = 0;
        for (Product product : products)
        {
            totalQuantity = totalQuantity + product.getQuantity();
            totalPrice = totalPrice + (product.getQuantity() * product.getPriceProduct());
        }
        System.out.println("totalPrice = " + totalPrice + " totalQuantity = " + totalQuantity);
    }
}
