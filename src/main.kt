//1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)
//
//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
//
//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
//
//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
//*/
fun main(){

    oddNumbers()

    println(namelength(arrayOf("Joyce","Classical","Avenue","Schedule")))


    drinks(4)
    drinks(6)
    drinks(14)
    drinks(7)
    drinks(15)
    drinks(5)


    multiples()


}
fun oddNumbers(){

        for (num in 1..100)
            if (num%2 !== 0) {
                println(num)

            }
}

fun namelength(name:Array<String>):Int{
    var num=0
    name.forEach { a ->
        if (a.length > 5){
            num++
        }
    }
    return num
}
//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
//

fun drinks(age:Int){
    if ( age < 6){
        println("milk")
    }
    else if (age>6 && age<15){
        println("fanta orange")
    }
    else {
        println("coca cola")
    }

}
//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun multiples() {
    for (num in 1..1000)
        if (num % 3 == 0) {
            println("Fizz")

            if (num % 5 == 0) {
                println("Buzz")
            }
            else if (num % 3 == 0 || num % 5 == 0) {
                println("FizzBuzz")
            }
        }
}