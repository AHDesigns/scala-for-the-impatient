import C01._
import org.scalatest.{FlatSpec, Matchers}

class C01Spec extends FlatSpec with Matchers {
  "computeBigInt" should "compute 2 pow 1024" in {
    computeBigInt() shouldBe BigInt("1797693134862315907729305190789024733617976978942306572734" +
      "300811577326758055009631327084773224075360211201138798713933576587897688144166224928474" +
      "3063947412437776789342486548527630221960124609411945308295208500576883815068234246288147" +
      "3913110540827237163350510684586298239947245938479716304835356329624224137216")
  }

  "genRandomPrime" should "compute random numbers" in {
    genRandomPrime() should not be genRandomPrime()
  }

  "getFileName" should "generate random file names" in {
    val res = genFileName()

    res.length() shouldBe 20
    res.matches("[a-z0-9]*") shouldBe true
  }

  "firstAndLast" should "get the first and last letter in string" in {
    firstAndLast("hello") shouldBe ('h', 'o')
  }
}
