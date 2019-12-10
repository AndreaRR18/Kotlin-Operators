package Operators

infix fun <A,B,C> ((A)->(B?)).chain(g: (B) -> C?): (A) -> C? {
    return { a ->
        val optionalB = this(a)
        if (optionalB == null) { null }
        else { g(optionalB) }
    }
}

fun firstFunOptional(a: Int): String? {
    return "$a"
}

fun secondFunOptional(b: String): String? {
    return null
}
val cOptional = ::firstFunOptional chain ::secondFunOptional