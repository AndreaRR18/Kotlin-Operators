package Operators

infix fun <A,B> A.with(f: (A) -> B): B = f(this)



fun main() {
    val string = 10

    fun toString(x: Int): String {
        return "$x"
    }

    val y = string with ::toString
}
