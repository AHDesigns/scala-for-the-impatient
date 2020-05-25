object C01 {
  /**
    *  6. 
    *  
    *  Using BigInt, compute 2^1024.
    */
  def computeBigInt(): BigInt = BigInt(2) pow 1024

  /**
    *  7.
    * 
    * What do you need to import so that you can get a random prime
    * as `probablePrime(100, Random)`, without any qualifiers before 
    * `probablePrime` and `Random`?
    */
  def genRandomPrime(): BigInt = {
    import util.Random
    import BigInt.probablePrime

    probablePrime(100, Random)
  }

  /**
    * 8.
    * 
    * One way to create random file or directory names is to produce
    * a random `BigInt` and convert it to base 36, yielding a string 
    * as `"qsnvbevtomcj38o06kul"`. Poke around Scaladoc to find a way 
    * of doing this in Scala.
    */
  def genFileName(): String = {
    import util.Random
    import BigInt.probablePrime

    probablePrime(100, Random).toString(36)
  }

  /**
    *  9.
    * 
    * How do you get the first character of a string in Scala? The last character?
    */
  def firstAndLast(s: String): (Char, Char) = {
    (s.head, s.last)
  }
}
