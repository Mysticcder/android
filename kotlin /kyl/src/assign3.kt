fun main() {
    var name = "Marcus"
    var age = 29
num2()
num3()
    println(name)
    println(age)
}

fun num2() {
    val num = 58
    val num2 = 48
    val num3 = 21

    println("three num are: $num, $num2, $num3")
    val maximum = maxOf(num, num2, num3)
    val minimum = minOf(num, num2, num3)
    println("maximum of above three num: $maximum")
    println("minimum of above three num: $minimum")
}


fun num3(){
    val no1 = 72
    val no2 = 120
    var lcm: Int

    lcm = if (no1 > no2) no1 else no2

    while (true) {
        if (lcm % no1 == 0 && lcm % no2 == 0){
            println("The LCM of $no1 and $no2 is $lcm.")
            break
        }
        ++lcm
    }

}