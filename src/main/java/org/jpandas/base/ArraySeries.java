package org.jpandas.base;

import org.jpandas.api.Series;
import org.jpandas.api.Slice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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
    public V loc(Integer label) {
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
    public V iloc(int position) {
        return data[position];
    }

    @Override
    public Series<Integer, V> iloc(List<Integer> positions) {
        List<V> values = positions
            .stream()
            .map(i -> data[i])
            .collect(Collectors.toList());

        return new ArraySeries<>(values.toArray(data));
    }

    @Override
    public Series<Integer, V> iloc(Slice slice) {
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
