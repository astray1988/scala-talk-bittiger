package Future
import scala.concurrent.ExecutionContext.Implicits.global // thread pool
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success}
import scala.concurrent.duration._
/**
  * Created by dylan on 6/5/16.
  */
object FutureDemo {
  def main(args: Array[String]): Unit = {
    //def computation(): Int = { 1 / 0 }
    def computation(): Int = { 12 + 23}

    val theFuture = Future { computation() }

    /**
      * state:
      * Success
      * Failure
      *
      * callbacks:
      * onComplete:
      * onFailure
      * onSuccess
      */


//    theFuture.onComplete {
//      case Success(result) => {
//        println("success is here!")
//        println(result)
//      }
//
//      case Failure(e) => println("Error:" + e.getStackTrace )
//    }

    val result = Await.result(theFuture, 5.seconds)

    println(result)




  }
}
