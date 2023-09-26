// shows the divisors of a given number, then prints '1234'

function test() {
    d = 1234
    console(d)
}

function divisors() {
    console("please enter a positive integer:")
    n = readInt()
    d = 1
    while (d <= n) {
        if (n % d == 0) {
            console(d)
        }
        d = d + 1
    }
}

divisors()
test()
