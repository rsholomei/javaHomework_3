import product.Fruits;
import product.Juice;
import product.Vegetables;

import java.util.*;

public class InventoryOperation {
    public static List<Juice> juices = new ArrayList<>();
    public static List<Fruits> fruits = new ArrayList<>();
    public static List<Vegetables> vegetables = new ArrayList<>();
    public static Map <String, ArrayList> productArrayListMap = new HashMap<>();

    public static void removeFirstJuice()
    {
        juices.remove(0);
    }
    public static void removeFirstFruits()
    {
        fruits.remove(0);
    }
    public static void removeFirstVegetables()
    {
        vegetables.remove(0);
    }

    public static void addJuices()
    {
        juices.add(new CreateProduct().initializationJuice());
        productArrayListMap.put(new  Juice().getClass().toString().substring(14), (ArrayList) juices);
    }
    public static void addFruits()
    {
        fruits.add(new CreateProduct().initializationFruits());
        productArrayListMap.put(new  Fruits().getClass().toString().substring(14), (ArrayList) fruits);
    }
    public static void addVegetables()
    {
        vegetables.add(new CreateProduct().initializationVegetables());
        productArrayListMap.put(new  Vegetables().getClass().toString().substring(14), (ArrayList) vegetables);
    }

    public static void showInventory()
    {
        for( Map.Entry<String, ArrayList> entry : productArrayListMap.entrySet() ){
            String key = entry.getKey();
            System.out.println(key);
            switch (key)
            {
                case "Fruits" :
                    for (Fruits fruit:fruits)
                    {
                        System.out.print(fruit.getNameProduct()+" "+fruit.getPriceProduct() +
                                " " + fruit.getQuantity()+ " | ");
                    }
                    System.out.println();
                    break;
                case "Juice" :
                    for (Juice juice:juices)
                    {
                        System.out.print(juice.getNameProduct()+" "+juice.getPriceProduct() + " "
                                + juice.getQuantity() + " | ");
                    }
                    System.out.println();
                    break;
                case "Vegetables" :
                    for (Vegetables vegetable :vegetables)
                    {
                        System.out.print(vegetable.getNameProduct()+" "+vegetable.getPriceProduct()
                                + " " + vegetable.getQuantity() + " | ");
                    }
                    System.out.println();
                    break;
            }
        }

    }
    public static void totalPrice()
    {
        for( Map.Entry<String, ArrayList> entry : productArrayListMap.entrySet() ){
            String key = entry.getKey();
            long totalPrice = 0;
            System.out.println(key);
            switch (key)
            {
                case "Fruits" :
                    for (Fruits fruit:fruits)
                    {
                        totalPrice = totalPrice + (fruit.getQuantity() * fruit.getPriceProduct());
                    }
                    System.out.println("totalPrice = " + totalPrice);
                    break;
                case "Juice" :
                    for (Juice juice:juices)
                    {
                        totalPrice = totalPrice + (juice.getQuantity() * juice.getPriceProduct());
                    }
                    System.out.println("totalPrice = " + totalPrice);
                    break;
                case "Vegetables" :
                    for (Vegetables vegetables1:vegetables)
                    {
                        totalPrice = totalPrice + (vegetables1.getQuantity() * vegetables1.getPriceProduct());
                    }
                    System.out.println("totalPrice = " + totalPrice);
                    break;
            }
        }
    }
}