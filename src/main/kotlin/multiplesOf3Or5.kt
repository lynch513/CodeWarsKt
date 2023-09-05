// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
// Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
// Additionally, if the number is negative, return 0.
// Note: If the number is a multiple of both 3 and 5, only count it once.

object multiplesOf3Or5 {
//    fun solution(number: Int) : Int = (1 ..< number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
    fun solution(number: Int) : Int = (1 .. number - 1).filter { it % 3 == 0 || it % 5 == 0 }.sum()
}