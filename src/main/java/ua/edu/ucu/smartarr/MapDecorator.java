package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    MyFunction func;

    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        this.func = func;
    }

    @Override
    public Object[] toArray() {
        Object[] map_arr = smart_arr.toArray();
        int size = map_arr.length;
        for (int i = 0; i < size; ++ i) {
            map_arr[i] = func.apply(map_arr[i]);
        }
        return map_arr;
    }

    @Override
    public String operationDescription() {
        return "Map decorator";
    }

    @Override
    public int size() {
        return toArray().length;
    }
}

