// errors for simple functions

function test() {
    x = 1
}

function test() {  // error: function 'test' is already declared
    y = 1
}

test()
sort()  // error: function 'sort' is not declared
