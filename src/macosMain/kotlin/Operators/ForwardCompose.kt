package Operators

infix fun <A,B,C> ((A)->B).pipe(g: (B) -> C): (A) -> C {
    return {
        g(this(it))
    }
}