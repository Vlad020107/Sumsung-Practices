package Project

import kotlin.random.Random

class Knight(
    health:Float,
    power:Float,
    private var defence:Float
):Human(health,power) {
    override fun attack(p2:Human){
        p2.health -= (Random.nextInt(1, 10) + 25)
        println(p2.health)
    }
    override fun heal(){
        health += Random.nextInt(1, 5)
    }
    fun Defence(defence: Float){
        health += 10
    }
}