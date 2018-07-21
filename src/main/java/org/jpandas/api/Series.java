package org.jpandas.api;

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
}
