
// CALLING:
//  fizzbuzz(20)
//SHOULD RETURN:
//  "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz

//// 1st ATTEMPT
// if and else
//fun fizzbuzz(number: Int): String {
//    return if (number % 5 == 0 && number % 3 == 0) {
//        "FizzBuzz"
//    }
//    else if (number % 3 == 0) {
//        "Fizz"
//    } else if (number % 5 == 0) {
//        "Buzz"
//    } else {
//        number.toString()
//    }
//}

//// 2nd ATTEMPT
// when
//fun fizzbuzz(number: Int): String {
//     return when {
//        number % 5 == 0 && number % 3 == 0 -> "FizzBuzz"
//        number % 3 == 0 -> "Fizz"
//        number % 5 == 0 -> "Buzz"
//        else -> number.toString()
//    }
//}

//// 3rd ATTEMPT
//
    fun fizzbuzz(number: Int): String {
        return (1.rangeTo(number)).joinToString(", ") { n ->
            when {
                n % 5 == 0 && n % 3 == 0 -> "FizzBuzz"
                n % 3 == 0 -> "Fizz"
                n % 5 == 0 -> "Buzz"
                else -> n.toString()
            }
        }
    }



