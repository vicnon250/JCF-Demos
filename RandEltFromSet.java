import java.util.*;

public class RandEltFromSet {
    
    static final int MAXVAL = 100;
    static Random rand = new Random();
    
    public static void main(String[] args) {
        Set<Integer> setOfInts = new HashSet<>();
        for(int val = 0; val < MAXVAL; val++) {
            setOfInts.add(val);
        }
        System.out.printf("setOfInts.size() is: %d\n",setOfInts.size());
        
        int luckyNumber = RandomSelectFromSet_1(setOfInts);
        System.out.printf("The lucky number is: %d\n",luckyNumber);
        luckyNumber = RandomSelectFromSet_2(setOfInts);
        System.out.printf("Another lucky number is: %d\n",luckyNumber);
    }
    
    static int RandomSelectFromSet_1(Set<Integer> setOfInts) {
        /*
         * easy & simple from a programmer's view,
         * but wasteful & inefficient because it
         * allocates an ArrayList<> just for choosing
         * an element, the ArrayList is created &
         * destroyed each time the function is called;
         * not a big deal for a small set of numeric
         * values, but could be a performance drag when
         * done on a large set of strings, for example
         */
        List<Integer> listOfInts = new ArrayList<>(setOfInts);
        return listOfInts.get(rand.nextInt(listOfInts.size()));
    }

    static int RandomSelectFromSet_2(Set<Integer> setOfInts) {
        /*
         * a better way, only slightly more complicated
         * but works well no matter how large or small
         * the set is and doesn't require a lot of
         * redundant copying over & over
         */
        int stopLoopAtThisValue = rand.nextInt(setOfInts.size());
        int count = 0;
        for(int val : setOfInts) {
            if (count == stopLoopAtThisValue) {
                return val;
            }
            count++;
        }
        return -1; // should be unreachable
    }
}