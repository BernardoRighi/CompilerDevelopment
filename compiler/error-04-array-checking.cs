// semantic errors for arrays

i = 2
a = []
a.push(1)
s = "Z"

i = []          // error: 'i' is already declared
a = []          // error: 'a' is already declared
s = []          // error: 's' is already declared

a = 2           // error: 'a' is array
a = "X"         // error: 'a' is array

a[a] = 2        // error: array index must be integer
a[s] = 2        // error: array index must be integer

i[0] = 2        // error: 'i' is not array
a[0] = a        // error: 'a' is array
a[0] = s        // error: 'a' is array
s[0] = 2        // error: 'i' is not array
x[0] = 2        // error: 'x' not defined

i = a           // error: 'i' is integer
i = i[0]        // error: 'i' is not array
i = s[0]        // error: 's' is not array
i = x[0]        // error: 'x' not defined

i = i.length    // error: 'i' must be array
i = s.length    // error: 'i' must be array
i = x.length    // error: 'x' not defined

s = a

console(a + a)    // error: cannot mix types
console(a - i)    // error: cannot mix types
console(i * a)    // error: cannot mix types
console(a / s)    // error: cannot mix types
console(8 % (a))  // error: cannot mix types

while (a > 2) {   // error: cannot mix types
    i = 1
}

if (2 <= a) {     // error: cannot mix types
    i = 2
}

if (a == a) {     // error: cannot mix types
    i = 3
}
