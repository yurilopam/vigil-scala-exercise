import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class SolutionTest extends AnyFlatSpec {

  "Given a text and a delimiter for the Solution class, when resolve() method is called " should
    "return an Array of String representing each line broken by the delimited size" in {
    val text: String = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s."
    val expectedResult: Array[String] = Array("Lorem Ipsum is simply dummy text of", "the printing and typesetting", "industry. Lorem Ipsum has", "been the industry's standard", "dummy text ever since the", "1500s.")

    val solution: Solution = new Solution(text, 40)
    val result = solution.resolve()
    result should contain theSameElementsAs expectedResult
  }

  it should "return an Array with size one when the delimiter size is bigger than text max characters" in {
    val text: String = "Lorem Ipsum is simply dummy text"
    val expectedResult: Array[String] = Array("Lorem Ipsum is simply dummy text")

    val solution: Solution = new Solution(text, 40)
    val result = solution.resolve()

    result should contain theSameElementsAs expectedResult
  }

  it should "return a Array with an empty String if an empty String is passed" in {
    val text: String = "                                                                 "
    val expectedResult: Array[String] = Array("")

    val solution: Solution = new Solution(text, 40)
    val result = solution.resolve()

    result should contain theSameElementsAs expectedResult
  }

  it should "return an empty Array if null String is passed" in {
    val text: String = null
    val expectedResult: Array[String] = Array()

    val solution: Solution = new Solution(text, 40)
    val result = solution.resolve()

    result should contain theSameElementsAs expectedResult
  }

}
