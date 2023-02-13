class Solution(text: String = "", delimiter: Int = 40) {

  private val breakLine: String = "BREAK_LINE"
  private val whiteSpace: String = " "

  def resolve(): Array[String] = {

    if (text == null) return Array()

    val words: Array[String] = text.trim().split(whiteSpace)

    val textWithBreakLineTag = words.reduce((accumulator, word) => {
      if (accumulator.length <= 0) {
        word
      } else if (accumulator.length + word.length - accumulator.lastIndexOf(breakLine) + 1 >= delimiter) {
        accumulator + breakLine + word
      } else {
        accumulator + whiteSpace + word
      }
    })
    textWithBreakLineTag.split(breakLine)
  }

}
