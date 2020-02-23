fun customer(name: String, number: String ){
    println("The user entered was:")
    println(name)
    println(number)

}
fun customer(name:String, number: String, buisnessName: String){
    println("The user entered was:")
    println(name)
    println(number)
    println(buisnessName)

}


fun main() {
    var userOption: Int = 0
    var userName: String =""
    var userBuisness: String =""
    var userPhoneNum: String =""

    do {
        println("Please select your customer category: ")
        println("1: Buisness")
        println("2: Residential")
        println("3: EXIT")
        print("---->")
        userOption = readLine()!!.toInt()
        if (userOption < 1 || userOption > 3)
            println("Please enter a number of 1, 2, or 3")
    } while (userOption < 1 || userOption > 3)

    if (userOption !=3) {
        print("What is your name: ")
        userName = readLine()!!.toString()
        print("What is your phone number: ")
        userPhoneNum = readLine()!!.toString()
    }

    when (userOption){
        1->{
            print("What is your buisness name: ")
            userBuisness = readLine()!!.toString()
            customer(userName, userPhoneNum, userBuisness)
        }
        2-> customer(userName, userPhoneNum)
        3-> println("You chose to EXIT the program")
    }

}