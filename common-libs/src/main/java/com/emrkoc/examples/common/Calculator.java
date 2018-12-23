package com.emrkoc.examples.common;

public class Calculator {

    private Extractor extractor;

    public int extractInt(int i){
        return (int) extractor.extract(i) - 1;
    }
}
