import org.scalatest.flatspec.AnyFlatSpec

class SolutionTest extends AnyFlatSpec {

  "Given a text and a delimiter for the Solution class, when resolve() method is called " should
    "return a String with BREAK_LINE tags if necessary" in {
    val text: String = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s."
    val expected: String = "Lorem Ipsum is simply dummy text ofBREAK_LINEthe printing and typesettingBREAK_LINEindustry. Lorem Ipsum hasBREAK_LINEbeen the industry's standardBREAK_LINEdummy text ever since theBREAK_LINE1500s."

    val solution: Solution = new Solution(text, 40)
    val textWithBreakLineTag = solution.resolve()
    println(textWithBreakLineTag)
    assert(textWithBreakLineTag.equals(expected))
  }

}
