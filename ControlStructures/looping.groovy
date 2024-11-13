// looping
// ----------------------

// while
List numbers = [1, 2, 3]
assert numbers
while (numbers) {
  numbers.remove(0)
}
assert numbers == []

// for
numbers = [1, 2, 3]
for (i in numbers) {
  print i + ',' // 1,2,3,
}
println ' '
for (Integer i in 10..20) {
  print i + ',' // 10,11,12,13,14,15,16,17,18,19,20,
}
println ' '

// return/break/continue
Integer a = 1
while (true) { // infinite loop
  a++
  if (a == 3) break
}
assert a == 3

for (String s in 'a'..'z') {
  if (s == 'a') continue
  println s
  if (s > 'b') break
}
