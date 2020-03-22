package com.demo.maven.demo;



import java.io.ObjectInputStream.GetField;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
class calculateInterest{
    private double simple_interest;
    private double compound_interest;
    
 public calculateInterest(double principal,int rate,int time) {
        simple_interest = (principal * rate * time)/100;
        compound_interest = principal*Math.pow(1+ rate/100,time);
 }
     
public double get_simple_interest(){
    return simple_interest;
} 
public double get_compound_interest(){
    return compound_interest;
}
 
}

public class App 
{
	  private static Logger LOGGER =LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        LOGGER.info( "Main Method invoked" );
        calculateInterest obj1 = new calculateInterest(10000,2, 2);
        double num1=obj1.get_simple_interest();
        double num2=obj1.get_compound_interest();
        LOGGER.info("simple interest is:"+ num1);
        LOGGER.info("compound interest is " + num2);
        
    }
}
