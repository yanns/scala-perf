package either
import org.openjdk.jmh.annotations.Benchmark

class EitherBench {

  @Benchmark
  def flatMapWithOneLeft(): Unit = {
    val result = for {
      i ← Right(2)
      j ← Right(5)
      l ← Left.apply[Int, Int](15)
      m ← Right(50)
    } yield i + j + l + m
    assert(result.isLeft)
  }

}
