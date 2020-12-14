package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] base_arr;

    public BaseArray(Object[] x) {
        this.base_arr = x;
    }

    public Object[] toArray() {
        int size = base_arr.length;
        Object[] base_arr1 = new Object[size];
        System.arraycopy(base_arr, 0, base_arr1, 0, size);
        return base_arr1;
    }

    @Override
    public String operationDescription() {
        return "BaseArray";
    }

    @Override
    public int size() {
        return base_arr.length;
    }
}
