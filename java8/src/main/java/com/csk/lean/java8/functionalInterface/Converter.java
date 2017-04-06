package com.csk.lean.java8.functionalInterface;

/**
 * Created by chensk on 2017/1/9.
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
