package org.jpandas.api;

import java.util.List;
import java.util.function.Function;

public interface Series<K,V> {

    /**
     * Get item from object for given key. Returns null if not found.
     *
     * @param key
     * @return value for corresponding key
     */
    V get(K key);

    /**
     * Get item from object for given key. Returns default value if not found.
     *
     * @param key
     * @param defaultValue
     *
     * @return value for corresponding key
     */
    V get(K key, V defaultValue);

    Series<K,V> loc(K label);
    Series<K,V> loc(List<K> label);
    Series<K,V> loc(boolean[] selection);
    Series<K,V> loc(Function<Series<K,V>,?> callable);

    Series<K,V> iloc(int position);
    Series<K,V> iloc(List<Integer> positions);
    Series<K,V> iloc(boolean[] selection);
    Series<K,V> iloc(Function<Series<K,V>,?> callable);
}
