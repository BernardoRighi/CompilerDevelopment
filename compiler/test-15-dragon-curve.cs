// Dragon curve
// https://en.wikipedia.org/wiki/Dragon_curve

function dragon(level, type) {
    if (type == 0) { // left
        if (level == 0) {
            console("    <line x1='0' y1='0' x2='500' y2='0' stroke='blue'/>")
        }
        else {
            console("    <g transform='scale(0.7071) rotate(-45)'>")
            dragon(level - 1, 0)
            console("    <g transform='translate(500,0) rotate(90)'>")
            dragon(level - 1, 1)
            console("    </g></g>")
        }
    }
    if (type == 1) { // right
        if (level == 0) {
            console("    <line x1='0' y1='0' x2='500' y2='0' stroke='red'/>")
        }
        else {
            console("    <g transform='scale(0.7071) rotate(45)'>")
            dragon(level - 1, 0)
            console("    <g transform='translate(500,0) rotate(-90) '>")
            dragon(level - 1, 1)
            console("    </g></g>")
        }
    }
}

// Random number generator
// LCG with m=134456, a=8121 and c=28411 (random0)
// https://en.wikipedia.org/wiki/Linear_congruential_generator

function random(last) int {
    return (8121 * last + 28411) % 134456
}

// Random fractal curve

function curve(level, last) {
    if (level == 0) {
        console("    <line x1='0' y1='0' x2='500' y2='0' stroke='black'/>")
    }
    if (level != 0) {
        last = random(last) // generate next random
        
        bit = (last / 256) % 2 // get ninth bit
        
        if (bit == 0) {
            console("    <g transform='scale(0.7071) rotate(-45)'>")
            curve(level - 1, last)
            console("    <g transform='translate(500,0) rotate(90)'>")
            curve(level - 1, last)
        }
        else {
            console("    <g transform='scale(0.7071) rotate(45)'>")
            curve(level - 1, last)
            console("    <g transform='translate(500,0) rotate(-90) '>")
            curve(level - 1, last)
        }
        console("    </g></g>")
    }
}

console("<svg xmlns='http://www.w3.org/2000/svg' version='1.1' width='1000' height='800' stroke-width='50'>")
console("  <g transform='translate(300,500)'>")

dragon(10, 0)

//seed = 1 // try other seed values
//curve(8, seed)

console("  </g>")
console("</svg>")
