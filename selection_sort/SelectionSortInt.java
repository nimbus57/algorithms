import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class SelectionSortInt {
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int low = list.get(i);
            int lowIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < low) {
                    low = list.get(j);
                    lowIndex = j;
                }
            }
            list.set(lowIndex, list.get(i));
            list.set(i, low);
        }
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
            System.exit(1);
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
