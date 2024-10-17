package Trash

import java.awt.Color

class Cabriolet(color: Color,
                gosNomer:Int,
                model:String,
        private var stateRoof:Boolean
): Car(color, gosNomer, model) {
    fun changeStateRoof(){
        stateRoof = !stateRoof
    }

    override fun pobibikati(){ // Перезаписываем логику родителя
        println("Тихий звук")
    }

}