import java.util.*;

public class ListsToFromArrays {

    // define some arrays, note that reference types must be used to make
    // the array an acceptable argument to Arrays.asList()
    static Integer[] intVals1 = {3, 20, 4, 96, 5, 70, 9, 32, 8, 45, 6, 7};
    static Character[] charVals1 = {'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '#', '@', '&'};

    public static void main(String[] args) {
        // initialize a JCF List from a conventional array of references
        System.out.print("This program shows various conversions between ");
        System.out.println("conventional arrays and the List<> containers");
        List<Integer> int_list1 = new ArrayList<>(Arrays.asList(intVals1));

        Integer[] intVals2 = {2, 4, 6, 8, 10, 12, 14};
        List<Integer> int_list2 = new ArrayList<>(Arrays.asList());
        int_list2.addAll(Arrays.asList(intVals2));

        List<Character> char_list1 = new LinkedList<>(Arrays.asList(charVals1));

        // initializing a list from literal values in a single statement
        // (without using a conventional array to hold the values)
        List<Character> char_list2 = new ArrayList<>(Arrays.asList('a','b','c','d'));

        // initialize an array from a JCF List<>
        Integer[] vals3 = int_list1.toArray(new Integer[0]);
        // print the array on a single line
        for (Integer v : vals3) {
            System.out.print(v + "\t");
        }
        System.out.println(); // end the line

        Character[] chars3 = char_list1.toArray(new Character[0]);
        // print the array on a single line
        for (Character c : chars3) {
            System.out.print(c + "\t");
        }
        System.out.println(); // end the line
        
        // from a string to a List<Character>
        char[] superWord = "Supercalifragilisticexpialidocious".toCharArray();
        List<Character> char_list3 = new ArrayList<>();
        for (char c : superWord) {
            char_list3.add(c);
        }
        System.out.println(char_list3); // print the ArrayList
    }
}
