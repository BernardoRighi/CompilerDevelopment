a = 1
x = "X"
b = 2
y = "Y"

a = 3
b = a
a = "Z"             // error: 'a' is integer
b = x               // error: 'b' in integer
a = readString()    // error: 'a' is integer

x = "Q"
y = x
x = 4               // error: 'x' is string
y = b               // error: 'y' is string
x = readInt()       // error: 'x' is string

console(123)
console("xyz")
console(a + x)      // error: cannot mix types
console(b - y)      // error: cannot mix types
console(x * "W")    // error: cannot mix types
console(y / x)      // error: cannot mix types
console(8 % (x))    // error: cannot mix types

if (a == x) {       // error: cannot mix types
    console(456)
}

while (y < 4) {     // error: cannot mix types
    console("hi!")
}
