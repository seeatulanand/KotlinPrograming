fun main(args: Array<String>) {
    var myCustomButton= MyCustomButton()
    myCustomButton.onClick()
    myCustomButton.onTouch()


}

interface Button1 {// You cannot create the instance of interface

    fun onTouch()                   // Methods in interface are abstract by default

    fun onClick() {                 // Normal methods are public and open by default but NOT FINAL
        println("Button1: onClick")

    }
}

interface Button2 {

    fun onTouch() {
        println("From Button 2")
    } //normal method
    fun onClick() {                 // Normal methods are public and open by default but NOT FINAL
        println("Button2: onClick")
    }
}
class MyCustomButton : Button1,Button2
{
    override fun onTouch() {
        super<Button1>.onClick()
        super<Button2>.onClick()
    }

    override fun onClick() {
        super.onTouch()
    }



}