object Tuple extends App {

  import scalaz._, Scalaz._

  def even(x: Int): Validation[NonEmptyList[String], Int] =
    if (x % 2 == 0) x.success else s"not even: $x".failureNel

  val pair: ValidationNel[String, (Int, Int)] = even(2) tuple even(3)

  println(pair)

}
