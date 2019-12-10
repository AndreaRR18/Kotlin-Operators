package Operators

infix fun <A> ((A) -> A).concat(f: (A) -> A): (A) -> A {
    return { a: A ->
        f(this(a))
    }
}

