import java.util.ArrayList;
public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items= new ArrayList<>();
        items.add("read");
        items.add(0,"yellow");
        System.out.println("Out putting elements with counter-controlled loop");
        for (int i=0;i<items.size();i++)
            System.out.printf("%s",items.get(i));
        display(items,"%n using enhanced for statement");
        items.add("green");
        items.add("yellow");
        display(items,"with two new elements");
        items.remove(1);
        display(items,"remove second list element (green)");
        System.out.printf("\"red\" is %s in the list %n",items.contains("red")?"":"not");
        System.out.printf("Size:%s%n:",items.size());




    }

    private static void display(ArrayList<String> items, String header) {
        System.out.println(header);
        for(String item :items)
            System.out.printf("%s",item);
        System.out.println();

    }
}
