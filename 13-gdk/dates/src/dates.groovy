import org.w3c.dom.ranges.Range

// create a new date
Date today = new Date()
println today
println '-----------'

Date bday = new Date('12/19/2015')
println bday
println bday.format('M-d-Y')
println '-----------'

// add & substract
// Date oneWeekMore = bday.plus(7)
Date oneWeekMore = bday + 7
// Date oneWeekAgo = bday.minus(7)
Date oneWeekAgo = bday - 7
println oneWeekMore
println oneWeekAgo
println '-----------'

// downto & upto
oneWeekMore.downto(bday){
    println it
}
println '-----------'
oneWeekAgo.upto(bday){
    println it
}
println '-----------'

groovy.lang.Range<Date> twoWeeks = oneWeekAgo..oneWeekMore
twoWeeks.each {
    print "${it.format('Y-M-d')}, "
}
println ''
println '-----------'

// nest & previous
Date newYear = new Date('01/01/2027')
println newYear.next()
println newYear.previous()
println '-----------'

Date now = new Date('10/30/2025')
println now.toTimestamp()
println now.toLocalDateTime()
println now.toDayOfWeek()
println now.toZonedDateTime()
println '-----------'
