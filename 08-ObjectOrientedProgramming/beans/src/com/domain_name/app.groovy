package com.domain_name

Employee emp = new Employee(first: 'Juan', last: 'Piza', email: 'jpiza@mail.com')
println emp // com.domain_name.Employee(Juan, Piza, jpiza@mail.com)

Employee empl = new Employee()
empl.first = 'Juan' // empl.setFirst('Juan')
empl.last = 'Piza' // empl.setLast('Piza')
empl.email = 'jpiza@mail.com' // empl.setEmail('jpiza@mail.com')
println empl // com.domain_name.Employee(Juan, Piza, jpiza@mail.com)

DoubleBean db = new DoubleBean()
db.value = 100
println db.value // 200
println db.@value // 100
