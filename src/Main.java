import java.util.*;

import StretegyDesignPattern.BItCoin;
import StretegyDesignPattern.CreditCardStrategy;
import StretegyDesignPattern.PayPalStrategy;
import StretegyDesignPattern.Payment;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {

        /* strategy pattern */
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(4);
        set.add(3);

        for(int key : set)
        {
            System.out.println(key);
        }




    }
}