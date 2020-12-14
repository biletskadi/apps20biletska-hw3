package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    MyComparator mc;

    public SortDecorator(SmartArray smart_arr, MyComparator compar) {
        super(smart_arr);
        this.mc = compar;
    }

    @Override
    public Object[] toArray() {
        Object[] sort_arr = smart_arr.toArray();
        System.out.println();
        Arrays.sort(sort_arr, mc);
        return sort_arr;
    }

    @Override
    public String operationDescription() {
        return "Sort Decorator";
    }

    @Override
    public int size() {
        return toArray().length;
    }
}

