package Operators

infix fun <A,B,C> ((B)->C).reversePipe(g: (A) -> B): (A) -> C {
    return {
        this(g(it))
    }
}