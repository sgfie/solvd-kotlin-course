package org.example.com.fie.kotlincourses.module1.unit1

fun main(){
    practice5task2()
}

//1. Conditional Statements
fun practice1task1(){
    val number = -3
    if(number > 0){
        println("This number is Positive")
    } else if(number > 0){
        println("This number is Negative")
    } else {
        println("This number is Zero")
    }
}
fun practice1task2(){
    val numberA = -23
    val isEven = numberA % 2;
    if(isEven == 0){
        println("This number $numberA is even")
    } else{
        println("This number $numberA is odd")
    }
}

//'when' expression
fun practice2task1(){
    val grade = 4;
    when(grade){
        1 -> println("Terrible")
        2 -> println("Bad")
        3 -> println("Okay")
        4 -> println("Good")
        5 -> println("Excellent")
    }
}
fun practice2task2(){
    val month = 7
    when(month){
        12 -> println("Winter")
        in 1..2 -> println("Winter")
        in 3 .. 5 -> println("Spring")
        in 6 .. 8 -> println("Summer")
        in 9..11 -> println("Autumn")
    }
}

//'for' loops
fun practice3task1(){
    for(i in 1..10){
        print("$i \t")
    }
}

fun practice3task2(){
    val numberB = 5
    for (i in 1..10){
        println("$numberB x $i = ${numberB * i}")
    }
}

//4. Ranges
fun practice4task1(){
    val range1 = 2..20 step 2
    for (r in range1){
        print("$r \t")
    }
}

fun practice4task2(){
    val range2 = 10 downTo 1
    for (r in range2){
        print("$r \t")
    }
}

//5. Arrays
fun practice5task1(){
    val users = arrayOf("Tom", "Sam", "Bob")
    for (user in users){
        println(user)
    }
}

fun practice5task2(){
    val numbers = arrayOf(2,4,29,4,42)
    var sum = 0
    val sum2 = numbers.sum()
    for (n in numbers){
        sum += n
    }
    println(sum)
    println(sum2)
}