class Solution(text: String, delimiter: Int) {
  
  val breakLine: String = "BREAK_LINE"
  
  private val whiteSpace: String = " "

  def resolve(): String = {
    val words: Array[String] = text.split(" ")

    words.reduce((accumulator, word) => {
      if (accumulator.length <= 0) {
        word
      } else if (accumulator.length + word.length - accumulator.lastIndexOf(breakLine) + 1 >= delimiter) {
        accumulator + breakLine + word
      } else {
        accumulator + whiteSpace + word
      }
    })
  }

}
