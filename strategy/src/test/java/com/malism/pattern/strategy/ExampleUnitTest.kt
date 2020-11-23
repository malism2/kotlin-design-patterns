package com.malism.pattern.strategy

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun simulator_duck() {
        var duck: Duck = MallardDuck().apply {
            setFlyBehavior(FlyWings())
            setQuackBehavior(Squeak())
        }
        action(duck)

        duck = ModelDuck(FlyNone(), Mute())
        action(duck)
    }

    private fun action(duck: Duck) {
        duck.display()
        duck.performFly()
        duck.performQuack()
    }
}