package com.allanmrg.service;

import java.util.stream.DoubleStream;

import converters.NumberConverter;

public class MathService {

    public Double sum(Double num01, Double num02){
        return num01 + num02;
    }

    public Double sub(Double num01, Double num02){
        return num01-num02;
    }

    public Double mult(Double num01, Double num02){
        return num01*num02;
    }

    public Double div(Double num01, Double num02){
        return num01/num02;
    }

    public Double sqrt(Double num01){
        return Math.sqrt(num01);
    }

    public Double avg(Double num01, Double num02){
        DoubleStream doubleStream = DoubleStream.of(num01,num02);
        return doubleStream.average().getAsDouble();
    }    
}