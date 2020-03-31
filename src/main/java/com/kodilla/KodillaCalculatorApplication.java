package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCalculatorApplication {
    public void AddValues (){
        int firstAdd = 2;
        int secondAdd = 3;
        int resultOfSubstract = firstAdd + secondAdd;
        System.out.println("Result of adding: "+  resultOfSubstract);
    }
    public void SubtractValues (){
        int firstSubs = 2;
        int secondSubs = 3;
        int resultOfSubstract = firstSubs - secondSubs;
        System.out.println("Result of subtract: " + resultOfSubstract);
    }
    public static void main(String[] args) {
        SpringApplication.run(KodillaCalculatorApplication.class, args);
        KodillaCalculatorApplication calculator = new KodillaCalculatorApplication();
        calculator.AddValues();
        calculator.SubtractValues();

    }

}
