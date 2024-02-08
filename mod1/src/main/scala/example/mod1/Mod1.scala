package example.mod1

import com.evolutiongaming.retry.OnError.Decision

object Mod1 extends App {
  def foo(d: Decision): Unit = {
    println(d)
  }
}
