object Problem extends App {

  private val text: String = "In 1991, while studying computer science at University of Helsinki, Linus Torvalds began a project that later became the Linux kernel. He wrote the program specifically for the hardware he was using and independent of an operating system because he wanted to use the functions of his new PC with an 80386 processor. Development was done on MINIX using the GNU C Compiler."
  private val delimiter: Int = 40

  private val solution = new Solution(text, delimiter)
  private val linesList: Array[String] = solution.resolve()

  linesList.foreach(line => println(line))

}
