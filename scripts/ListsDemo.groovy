/* groovylint-disable CompileStatic */
List nums = [1, 2, 3, 4, 5, 6, 9, 8, 7]
println nums // [1, 2, 3, 4, 5, 6, 9, 8, 7]
println nums.class.name // java.util.ArrayList

// add | remove | get | clear
//Add
nums.push(99)
nums.putAt(0,77)
nums[9]=79
println nums // [77, 1, 2, 3, 4, 5, 6, 9, 8, 79]
println nums + [3,4,6] // [77, 1, 2, 3, 4, 5, 6, 9, 8, 79, 3, 4, 6]
nums << 66
print "nums: "
println nums // nums: [77, 1, 2, 3, 4, 5, 6, 9, 8, 79, 66]
//Remove
def nums2 = nums.pop()
print "nums: "
print nums
print " | "
println nums2 // nums: [1, 2, 3, 4, 5, 6, 9, 8, 79, 66] | 77
nums2 = nums.removeAt(0)
print nums
print " | "
println nums2 // [2, 3, 4, 5, 6, 9, 8, 79, 66] | 1
def nums2New = nums - 2
println nums2New // [3, 4, 5, 6, 9, 8, 79, 66]
//Get
print "nums: "
print nums // [3, 4, 5, 6, 9, 8, 79, 66]
def nums3 = nums 
println nums3.getAt(0..3) // [2, 3, 4, 5]
println nums3 // [2, 3, 4, 5, 6, 9, 8, 79, 66]
// Clear
def nums4 = nums.clone()
nums4.clear()
print "nums: "
print nums
print " | "
println nums4 // nums: [2, 3, 4, 5, 6, 9, 8, 79, 66] | []
// flatten
nums << [3,4,5]
nums << [1,2]
println nums // [2, 3, 4, 5, 6, 9, 8, 79, 66, [3, 4, 5], [1, 2]]
nums = nums.flatten()
println nums // [2, 3, 4, 5, 6, 9, 8, 79, 66, 3, 4, 5, 1, 2]
// unique
println nums.unique() // [2, 3, 4, 5, 6, 9, 8, 79, 66, 1]

def numbers = [1,2,3,4,5,6,7,8,9,6,5,7,66,4,77,22,8,11] as Set
println numbers // [1, 2, 3, 4, 5, 6, 7, 8, 9, 66, 77, 22, 11]
println numbers.class.name // java.util.LinkedHashSet
