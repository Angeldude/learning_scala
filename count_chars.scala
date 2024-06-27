import scala.io.StdIn.readLine

object Main extends App:
    // Find the last element of a list.
    def last[T](l: List[T]): T = l.last

    println(last(List(1, 1, 2, 3, 5, 8)) == 8)

    // Find the last but one element of a list.
    def penultimate[T](l: List[T]): T = if l.length == 2 then l.head else penultimate(l.tail)

    println(penultimate(List(1, 1, 2, 3, 5, 8)) == 5)

    //count chars in input string
    println("Tell us something.")
    val input = readLine()
    val chars = input.length
    println(s"You wrote: $input and it is $chars characters long.")