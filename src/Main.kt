import Project.Knight
import Project.Robot
import Project.Wizard
import Trash.Car
import Trash.CustomCorporator
import java.awt.Color
import java.util.*

fun main() {
    /*var car = Trash.Car(Color.BLUE, gosNomer = 15, model = "Лада Седан")// Конструктор
    var car1 = Trash.Car(Color.BLUE, gosNomer = 15, model = "Лада Седан")
    var car3 = Trash.Car(Color.BLUE, gosNomer = 15, model = "Лада Седан")
    var car4 = Trash.Car(Color.BLUE, gosNomer = 15, model = "Лада Седан")
    var car2 = Trash.Cabriolet(Color.RED, 777,"BMW", false)
    var gruzovichoc = Trash.Gruzovic(gosNomer = 111, color = Color.RED, model = "GAR", destination = Trash.Destination.West)

    car1.pobibikati()
    println(Trash.Car.count)
    car2.pobibikati()
    println(Trash.Car.count)
    car3.pobibikati()
    println(Trash.Car.count)
    car4.pobibikati()
    println(Trash.Car.count)

    car.pobibikati()
    car2.changeStateRoof()
    car2.pobibikati()
    println(car)

    var dest = Trash.Destination.East

    when(dest){
        Trash.Destination.East -> {

        }
        Trash.Destination.South -> {

        }
        Trash.Destination.North -> {

        }
        Trash.Destination.West -> {

        }
    }

    Trash.Car.countIncrease()
    */

//    var arrayCar = arrayOf(
//        Car(gosNomer = 777, color = Color.BLUE, model = "Lada"),
//        Car(gosNomer = 123, color = Color.BLUE, model = "Lada"),
//        Car(gosNomer = 365, color = Color.BLUE, model = "Lada")
//    )
//    println("/////////////////////")
//    println(arrayCar.contentToString())
//    Arrays.sort(arrayCar)
//    println(arrayCar)
//
//    val customCorporator = CustomCorporator()
//
//    Arrays.sort(arrayCar, customCorporator)
//    println(arrayCar.contentToString())

    var player1 = Wizard(100F,10F,20F)
    var player2 = Robot(100F,16F,98F)
    var player3 = Knight(100F,25F,57F)

}