object Problem extends App {

  private val text: String = "In 1991, while studying computer science at University of Helsinki, Linus Torvalds began a project that later became the Linux kernel. He wrote the program specifically for the hardware he was using and independent of an operating system because he wanted to use the functions of his new PC with an 80386 processor. Development was done on MINIX using the GNU C Compiler."
  private val delimiter: Int = 40

  solution(text, delimiter)

  private def solution(text: String, delimiter: Int): Unit = {
    val words: Array[String] = text.split(" ")
    val whiteSpace: String = " "
    val breakLine: String = "BREAK_LINE"

    val wordsWithBreakLine: String = words.reduce((accumulator, word) => {

      if (accumulator.length <= 0) {
        word
      } else if (accumulator.length + word.length - accumulator.lastIndexOf(breakLine) + 1 >= delimiter) {
        accumulator + breakLine + word
      } else {
        accumulator + whiteSpace + word
      }
    })

    val brokenLines = wordsWithBreakLine.split(breakLine)
    brokenLines.foreach(line => println(line))

  }

}
