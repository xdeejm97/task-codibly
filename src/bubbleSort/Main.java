package bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        List<Integer> exampleOne = new ArrayList<>();
        exampleOne.add(null);
        exampleOne.add(4);
        exampleOne.add(5);
        exampleOne.add(6);
        exampleOne.add(8);
        exampleOne.add(3);
        exampleOne.add(8);

        List<Integer> exampleTwo = new ArrayList<>();
        exampleOne.add(null); // RuntimeException

        System.out.println(bubbleSort.sort(exampleOne)); // sortedNumbers(input)
        System.out.println(exampleTwo);

    }
}
