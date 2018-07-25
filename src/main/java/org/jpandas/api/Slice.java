package org.jpandas.api;

public class Slice {
    private final Integer start;
    private final Integer end;
    private final Integer step;

    private Slice(Integer start, Integer end, Integer step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public static Slice of(Integer start){
        return new Slice(start, null, null);
    }

    public static Slice of(Integer start, Integer end){
        return new Slice(start, end, null);
    }

    public static Slice of(Integer start, Integer end, Integer step){
        return new Slice(start, end, step);
    }
}
