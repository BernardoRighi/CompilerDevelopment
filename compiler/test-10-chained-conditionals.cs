// must print 1

a = 1
b = 2
c = 3
if (a == b) {
    if (b != c) {
        console(b)
    } else {
        console(c)
    }
} else {
    if (a > b) {
        console(b)
    } else {
        if (a < b) {
            if (b > c) {
                console(c)
            } else {
                console(a)
		    }
	    }
    }
}
