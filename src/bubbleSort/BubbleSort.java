package bubbleSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BubbleSort {

    public List<Integer> sort(List<Integer> input) {
        exceptionsMethods(input); //throw Runtime Exception if null

        List<Integer> sortInput = new ArrayList<>(input);
        sortInput.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        return sortInput;
    }

    private void exceptionsMethods(List<Integer> inputNumbers) {

        // if null then throw Runtime Exception
        if (inputNumbers.contains(null)) {
            throw new RuntimeException();
        }
    }
}

