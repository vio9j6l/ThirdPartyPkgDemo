/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: JPL5840
 Assignment: LB18
*/

package com.company;

import org.joda.money.Money;
import org.joda.money.format.MoneyFormatter;

import java.math.BigDecimal;

public class Main
{

    public static void main(String[] args) {
        /*
        Money m = Money.parse("USD 1.03");

        double doubleBalance = 1.03; // Start account at $1.03
        doubleBalance -= 0.42; // Withdraw 42 cents

        System.out.println(doubleBalance == 0.61); // will print false
        System.out.println(0.61 == doubleBalance); // will print false
        System.out.println(doubleBalance);

        // Compare balance to 0.61 by using some threshold
        System.out.println(        (doubleBalance-0.61) < 0.001      );
        System.out.println(Math.abs(0.61-doubleBalance) < 0.001      );

        System.out.println(1.01f);
        System.out.println(1.01f == 1.01D);

        System.out.println(new BigDecimal(1.01f));
        System.out.println(new BigDecimal(1.01D));

        System.out.println("PENNIES....");

        long balancePennies = 103; // $1.03
        balancePennies -= 42; // 42 cents
        System.out.println(balancePennies == 61);
        System.out.println(balancePennies);

        // How to display that money
        System.out.println(balancePennies / 100.0);
        System.out.println(new BigDecimal(balancePennies / 100.0));

         */
        System.out.println("joda-money");

        //write code
        Money balance = Money.parse("USD 1.03");
        balance = balance.minus(0.42);
        System.out.println(balance);        // will print USD 0.61

        //System.out.println(balance.equals(Money.parse("USD 0.61"))); // true
        Money compareTo = Money.parse("USD 0.61");
        System.out.println(balance.equals(compareTo)); // true
        System.out.println(balance.isEqual(compareTo));



    }
}
