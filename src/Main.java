import java.util.*;

import StretegyDesignPattern.BItCoin;
import StretegyDesignPattern.CreditCardStrategy;
import StretegyDesignPattern.PayPalStrategy;
import StretegyDesignPattern.Payment;

import java.util.*;
import java.io.*;
class Pair
{
    int first;
    int second;
    public Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}
public class Main {

    public static void main(String[] args)
    {
//        Pair p1 = new Pair(1,2);
//        Pair p2 = new Pair(1,2);
//
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.hashCode() +" " + p1.hashCode());

        String s1 = "pradeeP";
        String s2 = "pradeep";
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() +" " + s2.hashCode());



    }
}