import scala.io.StdIn.readLine

trait Greeting:
    def ask(): Unit

object Name extends Greeting:
  def ask() =  print("What is your name? ")

@main def main() =
    Name.ask()
    val name = readLine()
    println(s"Great, so your name is $name!")