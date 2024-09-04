// each & eachWithIndex
List favNums = [2, 11, 44, 35, 8, 4]
for (num in favNums) {
  print "${num} "
} // 2 11 44 35 8 4
println ''

favNums.each { print "${it }, " }  // 2, 11, 44, 35, 8, 4,
println ''

for (int i = 0; i < favNums.size(); i++) {
  print "$i:${favNums[i]} "
} // 0:2 1:11 2:44 3:35 4:8 5:4
println ''

favNums.eachWithIndex { num, idx ->
  print "$idx:$num, "
} // 0:2, 1:11, 2:44, 3:35, 4:8, 5:4,
println ''

// findAll
List days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
List weekend = days.findAll { it.startsWith('S') }
println days // [Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
println weekend // [Sunday, Saturday]

// collect
List nums = [1,2,3,7,2,8,2,4,6]
List numsTimeTen = []
nums.each { num ->
  numsTimeTen << num * 10
}
println nums // [1, 2, 3, 7, 2, 8, 2, 4, 6]
println numsTimeTen // [10, 20, 30, 70, 20, 80, 20, 40, 60]

List newTimesTen = nums.collect { num -> num * 10}
println newTimesTen // [10, 20, 30, 70, 20, 80, 20, 40, 60]
