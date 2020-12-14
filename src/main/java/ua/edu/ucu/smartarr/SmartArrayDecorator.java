package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {
    protected SmartArray smart_arr;

    public SmartArrayDecorator(SmartArray smart_arr) {
        this.smart_arr = smart_arr;
    }
}
