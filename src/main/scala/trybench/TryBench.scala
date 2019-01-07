package trybench

import org.openjdk.jmh.annotations.Benchmark

import scala.util.{Failure, Try}

class TryBench {

    @Benchmark
    def flatMapWithOneFailure(): Unit = {
      val result = for {
        i ← Try(2)
        j ← Try(5)
        l ← Failure(new Exception("boom"))
        m ← Try(50)
      } yield i + j + l + m
      assert(result.isFailure)
    }

  }
