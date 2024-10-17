package Project

import kotlin.random.Random

open class Human(
    var health:Float,
    private var power:Float
) {
   open fun attack(p2:Human){

   }
    open fun heal(){
        health += Random.nextInt(1,10)
    }
}