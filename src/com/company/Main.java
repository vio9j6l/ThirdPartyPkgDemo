/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: JPL5840
 Assignment: LB18
*/

package com.company;

import org.joda.money.Money;

public class Main
{

    public static void main(String[] args) {
        /*
        Money balance = Money.parse("USD 1.03");
        balance = balance.minus(0.42);
        System.out.println(balance.equals(Money.parse("USD 0.61"))); // true
        System.out.println(balance);        // will print USD 0.61

         */

        Money m = Money.parse("USD 1.03");

        double balance = 1.03; // Start account at $1.03
        balance -= 0.42; // Withdraw 42 cents

        System.out.println(balance == 0.61); // will print false
        System.out.println(balance); // will print false

        // Compare balance to 0.61 by using some threshold
        System.out.println(        (balance-0.61) < 0.001      );
        System.out.println(Math.abs(0.61-balance) < 0.001      );
    }
}
