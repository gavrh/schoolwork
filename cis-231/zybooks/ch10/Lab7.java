import java.util.Scanner;
import java.util.ArrayList;


public class Lab7 {

    // item to purchase
    public static class ItemToPurchase {
        
        // fields
        private String  itemName;
        private String  itemDescription;
        private int     itemPrice;
        private int     itemQuantity;

        // constructors 
        public ItemToPurchase() {
            itemName = "none";
            itemDescription = "none";
            itemPrice = 0;
            itemQuantity = 0;
        }
        public ItemToPurchase(String name, String description, int price, int quantity) {
            itemName = name;
            itemDescription = description;
            itemPrice = price;
            itemQuantity = quantity;
        }

        // methods
        public void setName(String name) { itemName = name; }
        public String getName() { return itemName; }

        public void setPrice(int price) { itemPrice = price; }
        public int getPrice() { return itemPrice; }

        public void setQuantity(int quantity) { itemQuantity = quantity; }
        public int getQuantity() { return itemQuantity; }

        public void setDescription(String description) { itemDescription = description; }
        public String getDescription() { return itemDescription; }

        public void printItemCost() {
            System.out.printf(
                "%s %d @ $%d = $%d\n",
                itemName,
                itemQuantity,
                itemPrice,
                itemPrice * itemQuantity
            );
        }
        public void printItemDescription() {
            System.out.printf("%s: %s\n", itemName, itemDescription);
        }

    }

    // shopping cart
    public static class ShoppingCart {
        
        // fields
        private String                      customerName;
        private String                      currentDate;
        private ArrayList<ItemToPurchase>   cartItems = new ArrayList<ItemToPurchase>();

        // constructors
        public ShoppingCart() {
            customerName = "none";
            currentDate = "January 1, 2016";
        }
        public ShoppingCart(String name, String date) {
            customerName = name;
            currentDate = date;
        }

        // methods
        public String getCustomerName() { return customerName; }
        public String getDate() { return currentDate; }

        public void addItem(ItemToPurchase item) { cartItems.add(item); }
        public void removeItem(String name) {
            for (int i = 0; i < cartItems.size(); i++) {
                ItemToPurchase item = cartItems.get(i);
                if (item.getName().equals(name)) {
                    cartItems.remove(i);
                    return;
                }
            }
            System.out.println("Item not found in cart. Nothing removed.");
        }
        public void modifyItem(ItemToPurchase mod_item) {
            for (int i = 0; i < cartItems.size(); i++) {
                ItemToPurchase item = cartItems.get(i);
                if (item.getName().equals(mod_item.getName())) {
                    if (!mod_item.getDescription().equals("none")) {
                        item.setDescription(mod_item.getDescription());
                    }
                    if (mod_item.getPrice() != 0) {
                        item.setPrice(mod_item.getPrice());
                    }
                    if (mod_item.getQuantity() != 0) { 
                        item.setQuantity(mod_item.getQuantity());
                    }
                    return;
                }
            }
            System.out.println("Item not found in cart. Nothing modified.");
        }
        
        public int getNumItemsInCart() {
            int count = 0;
            for (int i = 0; i < cartItems.size(); i++) {
                count += cartItems.get(i).getQuantity();
            }
            return count;
        }
        public int getCostOfCart() {
            int cost = 0;
            for (int i = 0; i < cartItems.size(); i++) {
                cost += (cartItems.get(i).getPrice() * cartItems.get(i).getQuantity());
            }
            return cost;
        }

        public void printTotal() {
            System.out.printf("%s's Shopping Cart - %s\n", customerName, currentDate);
            System.out.printf("Number of Items: %d\n\n", getNumItemsInCart());
            if (cartItems.size() > 0) {
                for (int i = 0; i < cartItems.size(); i++) {
                    cartItems.get(i).printItemCost();
                }
            } else {
                System.out.println("SHOPPING CART IS EMPTY");
            }
            System.out.printf("\nTotal: $%d\n", getCostOfCart());
        }
        public void printDescriptions() {
            System.out.printf("%s's Shopping Cart - %s\n", customerName, currentDate);
            if (cartItems.size() > 0) {
                System.out.println("\nItem Descriptions");
                for (int i = 0; i < cartItems.size(); i++) {
                    cartItems.get(i).printItemDescription();
                }
            } else {
                System.out.println("SHOPPING CART IS EMPTY");
            }
        }

    }

    // methods
    public static void printMenu() {
        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println();
    }
    public static void executeMenu(char option, ShoppingCart cart, Scanner scnr) {
        
        // menu options
        switch (option) {
            case 'a':
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                scnr.nextLine();
                String itemName = scnr.nextLine();
                System.out.println("Enter the item description:");
                String itemDescription = scnr.nextLine();
                System.out.println("Enter the item price:");
                int itemPrice = scnr.nextInt();
                System.out.println("Enter the item quantity:");
                int itemQuantity = scnr.nextInt();
                ItemToPurchase new_item = new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity);
                cart.addItem(new_item);
                break;
            case 'd':
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove:");
                scnr.nextLine();
                cart.removeItem(scnr.nextLine());
                break;
            case 'c':
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                ItemToPurchase mod_item = new ItemToPurchase();
                scnr.nextLine();
                mod_item.setName(scnr.nextLine());
                System.out.println("Enter the new quantity:");
                mod_item.setQuantity(scnr.nextInt());
                cart.modifyItem(mod_item);
                break;
            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                cart.printDescriptions();
                break;
            default: // 'o'
                System.out.println("OUTPUT SHOPPING CART");
                cart.printTotal();    
        }

    }


    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

        // prompt for customer info
        System.out.println("Enter customer's name:");
        String customerName = scnr.nextLine();
        System.out.println("Enter today's date:");
        String currentDate = scnr.nextLine();
        
        // create shopping cart
        ShoppingCart cart = new ShoppingCart(customerName, currentDate);
        // output
        System.out.println();
        System.out.printf("Customer name: %s\n", cart.getCustomerName());
        System.out.printf("Today's date: %s\n", cart.getDate());
        
        // menu loop
        while (true) {
            System.out.println();
            printMenu();
            char ch = ' ';
            while (true){
                int found = 0;
                switch (ch) {
                    case 'a':
                        found++;
                        break;
                    case 'd':
                        found++;
                        break;
                    case 'c':
                        found++;
                        break;
                    case 'i':
                        found++;
                        break;
                    case 'o':
                        found++;
                        break;
                    case 'q':
                        found++;
                        break;
                    default:
                        System.out.println("Choose an option:");
                        ch = scnr.next().charAt(0);
                }
                if (found > 0) { break; }
            }
            if (ch != 'q') {
                executeMenu(ch, cart, scnr);
            } else {
                break;
            }
        }

    }
}
