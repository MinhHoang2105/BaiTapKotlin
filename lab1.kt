package com.example.happybirthday
fun main(){
    println("Use the val keyword when the value doesn't change");
    println("Use the var keyword when the value can change.");
    println("When you define a function, you define the parameters that can be passed to it.");
    println("When you call a function, you pass arguments for the parameters.")
    //
    println("New chat message from a friend");
    //
    var discountPercentage: Int = 0;
    var offer: String = "";
    val item = "Google Chromecast";
    discountPercentage = 20;
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!";

    println(offer);
    //
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
    //
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
    //
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    //
    val firstUserEmailId = "user_one@gmail.com"

    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"
    println(displayAlertMessage(operatingSystem, emailId))
    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
}
fun add(a : Int, b : Int) : Int {
    return a + b;
}
fun displayAlertMessage(a : String, b: String) : String {
    return "There's a new sign-in request on $a for your Google Account $b "
}