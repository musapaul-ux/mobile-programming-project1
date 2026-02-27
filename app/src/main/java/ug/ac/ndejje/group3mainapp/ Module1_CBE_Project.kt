// challenge one
fun calculateMoMoFee(amount: Int, balance: Int){
    val fee = when (amount) {
        in 0..5000 -> 500
        in 5000 .. 60000 -> 1000
        else -> 2000
    }

    if( (amount + fee) <= balance ){
        println("You have successfully withdrawn UGX $amount at a fee of UGX $fee. Balance is UGX ${balance - amount - fee}")
    }else{
        println("Insufficient Funds!")
    }
}

//challenge 2
fun getGPA(score: Int){
    val GPA = when (score){
         in 80..100 -> 5.0
         in 75..79 -> 4.5
         in 70..74 -> 4.0
         in 65..69 -> 3.5
         in 60..64 -> 3.0
        else -> 0.0
    }
    println("Your score is $score and your GPA is $GPA")
}

//challenge 3
fun printStudentDetails(name:String?, studentNumber: String?){
    if(name != null && studentNumber != null) {
        println("Welcome $name Your RegNo: $studentNumber")
    }
    else {
        println("Error, Incomplete record")
    }

}

// main function
fun main(){
    // calling calculateMoMoFee()
    calculateMoMoFee(10000, 13000)
    calculateMoMoFee(10000, 11000)
    println()

    // calling getGPA()
    getGPA(45)
    getGPA(88)
    println()

    // calling printStudentDetails()
    printStudentDetails("", "ndu-24-360-034")
    printStudentDetails("Winnifred", null);
    printStudentDetails("Alex", "ndu-24-360-874")
}
