package org.jpandas.base;

import org.jpandas.api.Series;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ArraySeries<V> implements Series<Integer,V>{
    private V[] data;

    public ArraySeries(V[] data) {
        if(data == null){
            throw new IllegalArgumentException("data must be not null.");
        }

        this.data = Arrays.copyOf(data, data.length);
    }

    @Override
    public V get(Integer key) {
        return get(key, null);
    }

    @Override
    public V get(Integer key, V defaultValue) {
        if(key < 0){
            return defaultValue;
        }

        if(key >= data.length){
            return defaultValue;
        }

        return data[key];
    }

    @Override
    public Series<Integer, V> loc(Integer label) {
        return null;
    }

    @Override
    public Series<Integer, V> loc(List<Integer> label) {
        return null;
    }

    @Override
    public Series<Integer, V> loc(boolean[] selection) {
        return null;
    }

    @Override
    public Series<Integer, V> loc(Function<Series<Integer, V>, ?> callable) {
        return null;
    }

    @Override
    public Series<Integer, V> iloc(int position) {
        return null;
    }

    @Override
    public Series<Integer, V> iloc(List<Integer> positions) {
        return null;
    }

    @Override
    public Series<Integer, V> iloc(boolean[] selection) {
        return null;
    }

    @Override
    public Series<Integer, V> iloc(Function<Series<Integer, V>, ?> callable) {
        return null;
    }
}
