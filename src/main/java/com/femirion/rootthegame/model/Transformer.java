package com.femirion.rootthegame.model;

public interface Transformer<T, V> {
    V transform(T entity);
}
