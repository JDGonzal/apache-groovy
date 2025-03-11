package groovy

List numbers =[]

// push
print 'push:\t\t '
10.times{
    print "${it}, "
    numbers << it
}
println ''
println "numbers:\t ${ numbers }"

// pop
print 'pop:\t\t '
for (i in 9..0){
    print "${i}, "
    numbers.pop()
}
println ''
println "numbers:\t ${ numbers }"
