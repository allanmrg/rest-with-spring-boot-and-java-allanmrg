package com.allanmrg.controller;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.allanmrg.exceptions.UnsupportedMathOperationException;
import com.allanmrg.service.MathService;

import converters.NumberConverter;


@RestController
public class MathController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private MathService mathService = new MathService();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo) throws Exception{

            if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
                throw new UnsupportedMathOperationException("Please set a numeric value!");
            }

            return mathService.sum(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sub(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
        
            if(!NumberConverter.isNumeric(numberTwo) || !NumberConverter.isNumeric(numberOne)){
                throw new UnsupportedMathOperationException("Please set a numeric value!");
            }

            return mathService.sub(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double mult(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
        
            if(!NumberConverter.isNumeric(numberTwo) || !NumberConverter.isNumeric(numberOne)){
                throw new UnsupportedMathOperationException("Please set a numeric value!");
            }

            return mathService.mult(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double div(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
        
            if(!NumberConverter.isNumeric(numberTwo) || !NumberConverter.isNumeric(numberOne)){
                throw new UnsupportedMathOperationException("Please set a numeric value!");
            }

            return mathService.div(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));    
    }
    

    @RequestMapping(value = "/sqrt/{numberOne}", method=RequestMethod.GET)
    public Double sqrt(
        @PathVariable(value = "numberOne") String numberOne) throws Exception{
        
            if(!NumberConverter.isNumeric(numberOne)){
                throw new UnsupportedMathOperationException("Please set a numeric value!");
            }

            return mathService.sqrt(NumberConverter.convertToDouble(numberOne));
    }


    @RequestMapping(value = "/avg/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double avg(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
        
            if(!NumberConverter.isNumeric(numberTwo) || !NumberConverter.isNumeric(numberOne)){
                throw new UnsupportedMathOperationException("Please set a numeric value!");
            }

           return mathService.avg(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
}
