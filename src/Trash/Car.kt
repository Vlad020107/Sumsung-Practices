package Trash

import java.awt.Color

open class Car(
    private var color:Color,
    var gosNomer:Int,
    private var model:String
): IFly, ISwim,Comparable<Car> {

    companion object{
        var count:Int = 0

        fun countIncrease(){
            count++
        }
    }

    fun openBaggage(){
        // Открыть багажник
        println("розвучал ржавый скрип")
        color = Color.RED
    }
    open fun pobibikati(){
        // Побибикать
        println("Громкий звук")
        countIncrease()
    }

    override fun toString(): String {
        return "Trash.Car(color=$color, gosNomer=$gosNomer, model='$model')"
    }

    override fun fly(){

    }

    override fun swim() {

    }

    override fun compareTo(other: Car): Int {
        if (gosNomer==other.gosNomer){
            return 0
        }
        else if (gosNomer>other.gosNomer){
            return 1
        }
        return -1
    }

}