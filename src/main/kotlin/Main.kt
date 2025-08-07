package org.example

import java.awt.Rectangle

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /** Author Fie */
    //Assignment 1: Immutable Variable (val)
    val daysInWeek = 7;
    println("There are $daysInWeek days every week.");

    //Assignment 2: Mutable Variable (var)
    var userScore: Int = 0;
    userScore + 10;
    println("You have $userScore points!");

    //Assignment 3: Arithmetic Operators
    var width = 3.2;
    var height = 6.9;
    var theOneRectangle = width * height;
    println("Rectangle: $theOneRectangle m^2");
    //second way
    var theSecondRectangle = Rectangle(44, 72);
    println("Second Rectangle: " + theSecondRectangle.width * theSecondRectangle.height);

    //Assignment 4: Explicit Type Declarations
    var pi : Float = 3.14159F;
    println("pi : $pi");

    //Assignment 5: Single-Line Comment
    //Below is a variable for the users name
    var userName = "Lightning"; //See, so cool!

    //Assignment 6: Remainder Operator (%)
    var numberA = 26;
    var isEven : Boolean = numberA % 2 == 0;
    println("Is the Number Even? $isEven");
    println(numberA % 2)

    //Assignment 7: Template Strings
    val firstName = "Lewin";
    val lastName = "Light";
    //val fullName = firstName + " " + lastName;
    val fullName = "$firstName $lastName"; //string interpolation
    println("My name is $fullName");


    //Assignment 8: Reassignment Error
    var balance = 100;   //fix here val -> var
    balance = 120;
    println(balance);

    //Assignment 9: Comparison Operators
    var myAge = 34;
    var requiredAge = 21;
    if (myAge > requiredAge) {
        println("You met the age requirement!")
    };
    else {
        println("You do not meet the age requirement!")
    };
    //other way
    var isOldEnough = myAge > requiredAge;
    println("Are you old enough? $isOldEnough");

    //Assignment 10: Multiline Comment
    /*
    The basic calculation for what you save with percentages is:
    the discount percentage / 100 * price
    Then you take the original price and take out the percentage amount
    eg: 20% / 100 = 0.2
    0.2 * 20 = 4
    20(price) - 4 = 16
     */
    var burgerPrice = 20;
    val discountPercentage : Double = 20.0;
    var discountCalculate : Double = discountPercentage / 100.0;
    println(discountCalculate);
    println("Burger is $burgerPrice dollars, but now it's $discountPercentage% off!!");
    var discountPrice = burgerPrice * discountCalculate;
    println("Your new burger price is ${burgerPrice - discountPrice}!");
    //simplified test
    var friesPrice = 20;
    var newFriesPrice : Double = friesPrice - ((discountPercentage / 100.0) * friesPrice);
    println("but your fries cost $newFriesPrice as well...");

    //Assignment 11: Choosing the Right Data Type
    var isUserActive : Boolean = true;
    println("Is user $userName active? $isUserActive");

    //Assignment 12: Expression in a Template String
    var temp = 21;
    val isWarm = "It is warm";
    val isCold = "It is cold";
    println("${if(temp > 20) isWarm else isCold}")
    //println(if(temp > 20) isWarm else if(temp < 20) isCold else "It is perfect");

    //Assignment 13: Combination of Operators
    var basketOne = 10
    var basketTwo = 13
    var baskets = 3
    var applePerBasket = 15
    var extraApples = 7
    //println("There are 2 baskets. One has $basketOne apples and the other has $basketTwo apples. There are two apples besides them.")
    //println("How many apples are there: ${basketOne + basketTwo + 2}")
    println("How many apples are there: ${baskets * applePerBasket + extraApples}")

    //Assignment 14
    //var canDoorBeOpened = false;
    var haveKey = true;
    var passcode = "1234";
    println("You have the key, what is the passcode?")
    val myInput = readLine();
    if (haveKey == true && myInput.equals(passcode)){
        println("You enter")
    }
    else {
        println("DENIED");
    }

    //Assignment 15:
    var messageCount = 2;
    messageCount++;
    messageCount = messageCount + 1; //same as above
    println(messageCount);
    println(++messageCount);
    

    





    /*
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }*/
}