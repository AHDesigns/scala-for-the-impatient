import C02.signum

object C03 {
  /**
    * 1. 
    * 
    * Write a code snippet that sets a to an array of n random integers between
    * 0 (inclusive) and n (exclusive).
    */
  def randomArr(n: Int) = Array.fill(n)(util.Random.between(0, n))

  /**
    * 2.
    * Write a loop that swaps adjacent elements of an array of integers. For
    * example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
    */
  def swapLoopInPlace(a: Array[Int]) {
    for (i <- a.indices if i % 2 != 0) {
      val tmp = a(i)
      a.update(i, a(i-1))
      a.update(i -1, tmp)
    }
  }

  /**
    * 3.
    * Repeat the preceding assignment, but produce a new array with the swapped
    * values. Use for/yield.
    */
  def swapLoop(a: Array[Int]) = {
    for (i <- a.indices) yield a(
      if (i % 2 == 0)
        if (i == a.length -1) i
        else i + 1
      else i - 1
    )
  }

  /**
    * 4.
    * Given an array of integers, produce a new array that contains all positive
    * values of the original array, in their original order, followed by all
    * values that are zero or negative, in their original order.
    */
  def sortNumsSignum(a: Array[Int]) = {
    import collection.mutable.ArrayBuffer

    val positive = ArrayBuffer.empty[ Int ]
    val negative = ArrayBuffer.empty[ Int ]

    for (x <- a) {
      signum(x) match {
        case 1 => positive += x
        case _ => negative += x
      }
    }

    positive ++ negative
  }

  /**
    * 5.
    * 
    * How do you compute the average of an `Array[Double]`?
    */
  def average(a: Array[Double]) = a.sum / a.length
}
