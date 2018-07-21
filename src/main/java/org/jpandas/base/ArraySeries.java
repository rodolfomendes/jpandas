package org.jpandas.base;

import org.jpandas.api.Series;

import java.util.Arrays;

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
}
