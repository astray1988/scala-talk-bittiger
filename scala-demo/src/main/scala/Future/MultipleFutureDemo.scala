package Future

import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global // thread pool
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success}

/**
  * Created by dylan on 6/5/16.
  */
object MultipleFutureDemo {
  def main(args: Array[String]): Unit = {
    val f1 = Future {
      TimeUnit.SECONDS.sleep(2)
      65 + 54
    }

    val f2 = Future {
      TimeUnit.SECONDS.sleep(2)
      1 / 0
    } recover {
      case e: ArithmeticException => 0
      case e: RuntimeException => 0
    }

    val f3 = Future {
      TimeUnit.SECONDS.sleep(3)
      23 * 42
    }

    // calculate sum of f1, f2, f3

    val f4 = for {
      r1 <- f1
      r2 <- f2
      r3 <- f3
    } yield r1 + r2 + r3







  }
}
