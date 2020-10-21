import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

//reads in list but doesn't sort yet
public class SelectionSortInt {
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> list) {
        

            

            return list;
                
    }

    public static ArrayList<Integer> readFile(String fileName) {
        try (Scanner input = new Scanner(new File(fileName))) {
            ArrayList<Integer> input_list = new ArrayList<>();
            String[] s = input.nextLine().split(",");
            for (String st: s)
                input_list.add(Integer.parseInt(st));
            return input_list;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Integer> original_list = new ArrayList<>(readFile("array.txt"));        

        System.out.println("Original List");
        for (int i: original_list)
            System.out.println(i);

        ArrayList<Integer> sorted_list = selectionSort(original_list);
        System.out.println("Sorted List");
        for (int i: sorted_list)
            System.out.println(i);

    }
}
