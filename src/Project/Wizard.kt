package Project

import kotlin.random.Random

class Wizard(
    health:Float,
    power:Float,
    private var mana:Float
):Human(health, power) {
    override fun attack(p2:Human){
        p2.health -= (Random.nextInt(1, 10) + mana)
    }

}