object C02 {

  /**
    * 1. 
    * 
    * The signum of a number is 1 if the number is positive, –1 
    * if it is negative, and 0 if it is zero. Write a function 
    * that computes this value.
    */
  def signum(n: Int): Int = n match {
    case _ if n > 0 => 1
    case _ if n < 0 => -1
    case _ => 0
  }

  /**
    * 4.
    * 
    * Write a Scala equivalent for the Java loop:
    * `for (int i = 10; i >= 0; i--) System.out.println(i);`
    */
  def jLoop() = for (i <- 10 to 0 by -1) yield i

  /**
    * 5.
    * 
    * Write a procedure countdown(n: Int) that prints the numbers from n to 0.
    */
  def countdown(n: Int) {
    for (i <- n to 0 by -1) println(i)
  }

  /**
    * 6.
    * 
    * Write a for loop for computing the product of the Unicode codes of all
    * letters in a string. For example, the product of the characters in "Hello"
    * is 9415087488L.
    */
  def wordProductLoop(s: String) = {
    var product = 1L
    for (c <- s) {
      product *= c.toLong
    }
    product
  }

  /**
    * 7.
    * 
    * Same as above, no loop
    */
  def wordProduct(s: String) = s.map(_.toLong).product

  /**
    * 9.
    *  same as above but recursive
    */
  def product(s: String, total: Long = 1): Long = {
    if (s.isEmpty) total
    else product(s.tail, total * s.head)
  }

}
