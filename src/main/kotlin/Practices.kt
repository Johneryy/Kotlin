import java.util.*

fun main() {
//    val number = -10
//    val result = if(number > 0) {
//        "Positive number"
//    }else{
//        "Negative Number"
//    }
//    println(result)



//    val number = 5
//    val result = if (number > 0) "Positive number" else "Negative number"
//    println(result)



//    val n1 = 3
//    val n2 = 5
//    val n3 = -2
//    val max = if( n1 > n2) {
//        if(n1 > n3)
//            n1
//        else
//            n3
//    }else{
//        if(n2 > n3)
//            n2
//        else
//            n3
//    }
//    println("Max = $max")


    val reader = Scanner(System.`in`)
    print("Enter first age -> ")
    var stringInput:Int= reader.nextInt()
    print("Enter second age -> ")
    var stringInput1:Int= reader.nextInt()
    print("Enter third age -> ")
    var stringInput2:Int= reader.nextInt()

    val max = if(stringInput > stringInput1){
        if(stringInput > stringInput2)
            stringInput
        else
            stringInput1
    }else{
        if (stringInput1 > stringInput2)
            stringInput1
        else
            stringInput2
    }
    println("Max -> $max")

}