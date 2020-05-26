import C03._
import org.scalatest.{FlatSpec, Matchers}

class C03Spec extends FlatSpec with Matchers {
  "randomArr" should "create array of n random ints between 0 and n -1" in {
    val a = randomArr(8)

    a.length shouldBe 8
    a.forall(x => 0 <= x && x < 8) shouldBe true

    val b = randomArr(800)
    b.forall(x => 0 <= x && x < 800) shouldBe true
  }

  "swapLoopInPlace" should "swap adjacent elements in array" in {
    val a = Array(1,2,3,4,5)

    swapLoopInPlace(a)

    a shouldBe Array(2,1,4,3,5)
  }

  "swapLoop" should "swap adjacent elements in array" in {
    swapLoop(Array(1,2,3,4,5)) shouldBe Array(2,1,4,3,5)
    swapLoop(Array(1)) shouldBe Array(1)
    swapLoop(Array()) shouldBe Array()
  }

  it should "not mutate original array" in {
    val original = Array(1,2,3,4,5)
    val altered = swapLoop(original)
    original eq altered shouldBe false
  }

  "sortNumsSignum" should "sort an array as positive, zeros and negative numbers keeping order" in {
    sortNumsSignum(Array(1,4,-1,-9,0,2,0,-1)) shouldBe Array(1,4,2,-1,-9,0,0,-1)
  }

  "average" should "calc the average of an array"
  average(Array(2,4,6,8)) shouldBe 5
}
