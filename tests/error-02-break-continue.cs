// error when using break or continue

break     // error: cannot use break outside a loop

i = 1
while (i <= 10) {
    if (i == 5) {
        break
    }
    i = i + 1
    if (i == 2) {
        continue
    }
}

continue  // error: cannot use continue outside a loop
