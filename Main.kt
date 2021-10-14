fun main(args: Array<String>) {
    println("Hello World!")
 /*   for (x in -5..5 )
        //y=3x-1
     println(calculateY(3, x, -1))*/
    print(coordinates())
    println(intersection(3,5,4,2))

    // Try adding program arguments at Run/Debug configuration
    //println("Program arguments: ${args.joinToString()}")
}

fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c

    //y = 3x + 5
    //y = 4x + 2

    }

fun coordinates(){
    for (x in 0..20)
        if (calculateY(3, x, 5) == calculateY(4, x, 2)) {
            println("The coordinates at which the two lines intersect are: $x,${(calculateY(3, x, 5))}")
            break
        }
    else
        println("Don't intersect")
}



fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {

    var x: Int = 0
    for (x in 0..100) {

        val yOne = mOne * x + cOne
        val yTwo = mTwo * x + cTwo

        if (yOne == yTwo) {
            println("The X value the two lines intersect at is $x")
            break
        }
        else
            println("Do not intersect ")

    }
}