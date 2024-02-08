package example.mod2

import com.evolutiongaming.retry.OnError.Decision

object Mod2 extends App {
  def foo(d: Decision): Unit = {
    println(d)
  }
}
