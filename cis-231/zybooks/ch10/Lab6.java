import java.util.Scanner;

public class Lab6 {

    public static class ItemToPurchase {

        // fields
        private String  itemName;
        private int     itemPrice;
        private int     itemQuantity;

        // default constructors 
        public ItemToPurchase() {
            itemName = "none";
            itemPrice = 0;
            itemQuantity = 0;
        }

        // methods
        public void setName(String name) { itemName = name; }
        public String getName() { return itemName; }

        public void setPrice(int price) { itemPrice = price; }
        public int getPrice() { return itemPrice; }

        public void setQuantity(int quantity) { itemQuantity = quantity; }
        public int getQuantity() { return itemQuantity; }

    }
        
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // items
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // get values
        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        item1.setName(scnr.nextLine());
        System.out.println("Enter the item price:");
        item1.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity:");
        item1.setQuantity(scnr.nextInt());

        System.out.println();

        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        String random = scnr.nextLine();
        item2.setName(scnr.nextLine());
        System.out.println("Enter the item price:");
        item2.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity:");
        item2.setQuantity(scnr.nextInt());


        // total cost
        String name1 = item1.getName();
        String name2 = item2.getName();
        int price1 = item1.getPrice();
        int price2 = item2.getPrice();
        int quantity1 = item1.getQuantity();
        int quantity2 = item2.getQuantity();

        System.out.println("TOTAL COST");
        System.out.printf("%s %d @ $%d = $%d\n", name1, quantity1, price1, price1*quantity1);
        System.out.printf("%s %d @ $%d = $%d\n\n", name2, quantity2, price2, price2*quantity2);
        System.out.printf("Total: $%d\n", (price1 * quantity1) + (price2 * quantity2));

    }
}

