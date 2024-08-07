/*
for (int x = 1; x <= 10; ++x) {
  print x
}

println ''

for (int y = 10; y >= 1; --y) {
  print y
}

println ''

def letters = ['a', 'b', 'c']
for (int i = 0; i < letters.size(); ++i) {
  print letters[i]
}
*/

Range r = 1..10
println r
println r.class.name
println r.from
println r.to

assert (0..10).contains(0)
assert (0..10).contains(10)
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false

assert (0..<10).contains(0)
assert (0..<10).contains(10) == false

Date today = new Date()
Date oneWeekAway = today + 7
println today
println oneWeekAway

Range days = today..oneWeekAway
println days

Range letters = 'a'..'x'
print letters
