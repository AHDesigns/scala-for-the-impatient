import C02._
import org.scalatest.{FlatSpec, Matchers}

class C02Spec extends FlatSpec with Matchers {
  "signum" should "give 1 when passed a positive number" in {
    signum(1) shouldBe 1
    signum(3) shouldBe 1
    signum(798423) shouldBe 1
  }

  it should "give 0 when passed 0" in {
    signum(0) shouldBe 0
  }

  it should "give -1 when passed a negative number" in {
    signum(-1) shouldBe -1
    signum(-9) shouldBe -1
    signum(-913481) shouldBe -1
  }

  "jLoop" should "return a list of numbers" in {
    jLoop() shouldBe List(10,9,8,7,6,5,4,3,2,1,0)
  }

  "wordProductLoop" should "calculate the product of unicode codes in string" in {
    wordProductLoop("Hello") shouldBe 9415087488L
  }

  "wordProduct" should "calculate the product of unicode codes in string" in {
    wordProduct("Hello") shouldBe 9415087488L
  }

  "product" should "calculate the product of unicode codes in string" in {
    product("Hello") shouldBe 9415087488L
  }
}
