package ua.edu.ucu.smartarr;


import com.sun.deploy.perf.DefaultPerfHelper;

import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    private Object[] base_arr;

    public DistinctDecorator(SmartArray smart_arr) {
        super(smart_arr);
    }
    @Override
    public Object[] toArray() {
        Object[] dis_arr = smart_arr.toArray();
        boolean exit = false;
        int len = dis_arr.length;
        Object[] dis_arr2 = new Object[len + 1];
        int counter = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (dis_arr[i].equals(dis_arr[j])) {
                    exit = true;
                    break;
                }
            }
            if (!exit) {
                dis_arr2[counter] = dis_arr[i];
                counter++;
            }
            exit = false;

        }
        return Arrays.copyOf(dis_arr2, counter);
    }

    @Override
    public String operationDescription() {
        return "Remove same elements";
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
