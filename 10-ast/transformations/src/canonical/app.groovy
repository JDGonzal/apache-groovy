package canonical

Person p1 = new Person('Juan', 'Piza','jpiza@mail.com')
Person p2 = new Person('Juan', 'Piza','jpiza@mail.com')

assert p1 == p2
println p1.toString()
