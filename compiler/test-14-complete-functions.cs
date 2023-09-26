// test for complete function using recursion
// result: 120

function factorial(n) int {
    if (n <= 1) {
        return 1
    }
    return n * factorial(n - 1)
}

console(factorial(5))
