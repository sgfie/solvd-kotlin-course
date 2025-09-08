package org.example.com.fie.kotlincourses.module2

fun main() {
    //Function Type
    val greetings: () -> Unit;
    greetings = :: greet;
    //val greetings: () -> Unit = :: greet;
    greetings();

    val multiplying: (Int, Int) -> Int = :: multiplyUnit6;
    val result = multiplying(4,5);
    println(result);
    //println(multiplying(2,3));

    var action: (Int, Int) -> Int;
    action = :: substractUnit6;
    println(action(5,2));
    action = :: multiplyUnit6;
    println(action(5,2));

    println("High Order Function");
    //High Order Functions
    operate(5,5, :: multiplyUnit6);
    operate(6,2, ::substractUnit6);
    operate(3,4,:: add);

    var statement = chooseGreeting(true);
    statement();
    statement = chooseGreeting(false);
    statement();

    repeatAction(::goodMorning);

    //Anonymous Functions
    val sum = fun(a: Int, b: Int): Int = a + b;
    println(sum(7,3))

    doMath(7,4, fun(x: Int, y: Int): Int = x + y;)
    doMath(6,2, getAnonymous());

    //Lambda expressions
    run { println("Hello from Lambda") }

    val upperCase = { text: String -> text.uppercase(); }
    println(upperCase("kotlin"));

    println(applyOperation(2,3, { a, b -> a + b }));
    println(applyOperation(5,3, { a, b -> a * b }));
    println(applyOperation(4,2, { a, b -> a - b }));

}

//Function Type
fun greet() {
    println("Hello!");
}
fun multiplyUnit6(a: Int, b: Int): Int {
    return a * b;
}
fun substractUnit6(a: Int, b: Int): Int {
    return a - b;
}

//High Order Functions
fun operate(n1: Int, n2: Int, operation: (Int, Int) -> Int) {
    val result = operation(n1,n2);
    println(result);
}
fun add(a: Int, b: Int): Int {
    return a + b;
}
fun goodMorning(): Unit {
    println("Good Morning");
}
fun goodNight(): Unit {
    println("Good Night");
}
fun chooseGreeting(state: Boolean): () -> Unit {
    when(state){
        true -> return ::goodMorning;
        false -> return ::goodNight;
    }
}
fun repeatAction(toRepeat: () -> Unit) {
    for (i in 1..3) {
        toRepeat();
        //Note to self, writing return toRepeat() ends the loop
    }
}

//Anonymous Function
fun doMath(a: Int, b: Int, operation: (Int, Int) -> Int) {
    println(operation(a,b));
}
fun getAnonymous(): (Int, Int) -> Int {
    return fun(a: Int, b: Int): Int = a - b;
}

fun applyOperation(a: Int, b: Int, ope: (Int, Int) -> Int) : Int {
    val result = ope(a, b);
    return result;
}