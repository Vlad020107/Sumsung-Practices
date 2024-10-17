package Project

import kotlin.random.Random

class Robot(
    health:Float,
    power:Float,
    private var battery:Float
):Human(health,power) {
    override fun attack(p2:Human){
        if (battery > 50){
            p2.health -= (Random.nextInt(1, 10) + 20)
            println(p2.health)
        }
        else if((battery > 0) && (battery <= 50)){
            p2.health -= (Random.nextInt(1, 10))
            println(p2.health)
        }
    }
    override fun heal(){
        if (battery > 50){
            health += Random.nextInt(15, 30)
        }
        else if ((battery > 0) && (battery <= 50)){
            health += (Random.nextInt(1, 15))
        }

    }
}