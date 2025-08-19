package org.example.com.fie.kotlincourses.module2

fun main() {
    greet("Lewin");
    displayUser("Light", 34);
    showMessage("And so on...");
    showMessage("I'd like two hamburgers, please and thanks!");

    printNumbers(2,3,47,1,6,2,6,2,46);
    concatStrings("this is one", "this is weird", "this seems like a lot of work");
    addToGroup("The Angel Trio", "Lewin", "Arthur", "Shura");

    println(multiply(2, 8));
    println(isEven(3));
    printIfPositive(42);
    printIfPositive(0);
    printIfPositive(-2);

    println(cube(4));
    checkAndPrint(-2);
    compare(4, 2); //Question: Why doesn't it automatically do the a= thing like other places?

    show("Hi Hello")
    show(42)
    max(8,6)
    max(3.4, 3.6)
    sum(3,42)
    sum(3,2,5)
}

//Unit 1.1 greet function
fun greet(name: String) {
    println("Hello $name!");
}

//Unit 1.2 displayUser function
fun displayUser(name: String, age: Int) {
    println("Name: $name, Age: $age");
}

//Unit 1.3 showMessage function
fun showMessage(message: String) {
    println(message);
}

//Unit 2.1 printNumbers
fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println(number);
    }
}

//Unit 2.2 concatStrings
fun concatStrings(vararg strings: String) {
    for (string in strings) {
        print("$string \t");
    }
}

//Unit 2.3 addToGroup
fun addToGroup(groupName: String, vararg names: String) {
    println("Group name: $groupName");   //Question for Artyom: Why does it print the group name on the same line as the previous function despite being a println?
    for (name in names) {
        println(name);
    }
}

//Unit 3.1 multiply
fun multiply(a: Int, b: Int): Int {
    return a * b;
}

//Unit 3.2 isEven
fun isEven(number: Int): Boolean {
    if (number % 2 == 0) {
        return true;
    }
    else return false;
}

//Unit 3.3 printIfPositive
fun printIfPositive(number: Int) {
    if(number > 0) {
        println(number);
        return;
    }
}

//Unit 4.1 square
fun cube(a: Int) = a*a*a;

//Unit 4.2 checkAndPrint
fun checkAndPrint(number: Int) {
    fun isValid(number: Int): Boolean {
        return number > 0;
    }
    if(!isValid(number)) {
        println("$number is invalid");
        return;
    }  else println("$number is valid");
}

//Unit 4.3 compare
fun compare(a: Int, b: Int) {
    fun smallNumber(number: Int): Boolean {
        return number < 10;
    }
    if(smallNumber(a) && smallNumber(b)) {
        println("Both less than 10");
        return;
    } else println("Not both less than 10");
}

//Unit 5.1 show
fun show(text: String) = println(text);
fun show(number: Int) = println(number);

//Unit 5.2 max
fun max(a: Int, b: Int) {
    if(a > b) {
        println(a);
    } else println(b);
}

fun max(a: Double, b: Double) {
    if(a > b) {
        println(a);
    } else println(b);
}

//Unit 5.3 sum
fun sum(a: Int, b: Int) = println(a+b);
fun sum(a: Int, b: Int, c: Int) = println(a+b+c);