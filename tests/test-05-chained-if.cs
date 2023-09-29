// must output 7

a = 1
b = 2
c = 3
if (a == b) {
    if (b > c) {
        console(4)
    }
    if (b <= c) {
        console(5)
    }
}
if (a != b) {
    if (a < b) {
        if (b > c) {
            console(6)
        }
        if (b <= c) {
            console(7)
        }
    }
    if (a >= b) {
        console(8)
    }
}
