import java.util.ArrayList;

public class GroceryList {
//    private int[] myArray; // we define type in here , but we dont define typr in ArrayList

    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("you Have"+ groceryList.size()+" items in your groceryList");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+". Element is"+groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+(position+1)+". has been modified");

    }
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        System.out.println(theItem);
        groceryList.remove(position);

    }
    public String findItem(String searchItem){
//        boolean exist = groceryList.contains(searchItem); // for searching returns boolean
        int position = groceryList.indexOf(searchItem);
         if(position >= 0){
             return groceryList.get(position);
         }
         return null;
    }
}
