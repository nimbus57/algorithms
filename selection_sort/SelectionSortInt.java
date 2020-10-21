import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

//reads in list but doesn't sort yet
public class SelectionSortInt {
    public static ArrayList<Integer> selectionSort() {
        try (Scanner input = new Scanner(new File("array.txt"))) {
            ArrayList<Integer> input_list = new ArrayList<>();

//try to makee this more succinct
            String[] s = input.nextLine().split(",");
            for (String st: s)
                input_list.add(Integer.parseInt(st));
            

            return input_list;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        
    }

//move reading of file to main() or to new method
//add printing of original list
    public static void main(String[] args) {
        ArrayList<Integer> sorted_list = new ArrayList<>(selectionSort());
        System.out.println("Sorted List");
        for (int i: sorted_list)
            System.out.println(i);

    }
}
