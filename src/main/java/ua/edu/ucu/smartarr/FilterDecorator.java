package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    MyPredicate pred;

    public FilterDecorator(SmartArray smart_arr, MyPredicate predict) {
        super(smart_arr);
        this.pred = predict;
    }

    @Override
    public Object[] toArray() {
        Object[] filter_arr = smart_arr.toArray();
        int size = filter_arr.length;
        Object[] filter_arr1 = new Object[size];
        int counter = 0;
        for (int i = 0; i < size; ++i) {
            if (pred.test(filter_arr[i])) {
                filter_arr1[counter] = filter_arr[i];
                counter+=1;
            }
        }
        return Arrays.copyOf(filter_arr1, counter);
    }

    @Override
    public String operationDescription() {
        return "Filtered objects";
    }

    @Override
    public int size() {
        return toArray().length;
    }

}
