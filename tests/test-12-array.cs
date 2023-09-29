// result:
// [1, 4, 9, 16, ...]

console("Enter array size:")
n = readInt()
a = []

i = 0
while (i < n) {
    a.push(i + 1)
    i = i + 1
}

i = a.length - 1
while (i >= 0) {
    a[i] = a[i] * a[i]
    i = i - 1
}
console(a)
