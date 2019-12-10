package Operators

infix fun <A,B> A.with(f: (A) -> B): B = f(this)