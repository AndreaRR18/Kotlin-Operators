package Operators

infix fun <A,B,C> ((A)->B).pipe(g: (B) -> C): (A) -> C {
    return {
        g(this(it))
    }
}

fun firstFun(a: Int): String {
    return "$a"
}

fun secondFun(b: String): String {
    return "$b!"
}

val c = ::firstFun pipe ::secondFun