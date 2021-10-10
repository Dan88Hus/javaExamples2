import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        // ArrayLists are resizable Array automatically
        boolean quit = true;
        int choice = 0;
        printInstructions();
        while (quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = false;
                    break;

            }

        }
    }
    public static void printInstructions(){
        System.out.println("1-ListItems\n2-addItem\n3-modifyItem\n4-removeItem\n5-searchForItem\n6-quit\r");

    }
    public static void addItem(){
        System.out.print("Enter Item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter Item number");
        int itemNo = scanner.nextInt();
        scanner.nextLine(); //it clears the buffer
        System.out.println("Enter replacement Item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem); //user counts from 1 , itemNo-1

    }
    public static void removeItem(){
        System.out.print("Enter Item number");
        int itemNo = scanner.nextInt();
        scanner.nextLine(); //it clears the buffer
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Enter Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null){
            System.out.println("Found "+ searchItem+" in our groceryList" );

        } else {
            System.out.println(searchItem+" is not in shopping List");
        }
    }
}
