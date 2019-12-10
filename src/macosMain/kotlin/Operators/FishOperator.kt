package Operators

infix fun <A,B,C> ((A)->(B?)).chain(g: (B) -> C?): (A) -> C? {
    return { a ->
        val optionalB = this(a)
        if (optionalB == null) { null }
        else { g(optionalB) }
    }
}