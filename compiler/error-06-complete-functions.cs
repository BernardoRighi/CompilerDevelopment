// errors for complete functions

function fw() int {
    return "ab"         // error: return value must be of integer type
}

function fx(a) {
    return 0            // error: a void function does not return a value
}

function fy(b, c) int {
    console(b + c)      // error: missing return statement in returning function
}

function fz(d, d) {     // error: parameter names must be unique
    console("ab")
}

fx()               // error: wrong number of arguments
fx(1, 2)           // error: wrong number of arguments
fx(1, 2, 3)        // error: wrong number of arguments

y = fy()           // error: wrong number of arguments
y = fy(1)          // error: wrong number of arguments
y = fy(1, 2, 3)    // error: wrong number of arguments

fx("ab")           // error: all arguments must be integer
y = fy(1, "ab")    // error: all arguments must be integer
y = fy("ab", 2)    // error: all arguments must be integer

e = fx(1)          // error: void function does not return a value

fy(1, 2)           // error: return value cannot be ignored

f = "ab"
f = fy(1, 2)       // error: types not matching
