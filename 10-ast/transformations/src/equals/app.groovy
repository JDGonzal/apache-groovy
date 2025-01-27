package equals

Person p1 = new Person(first: 'Juan', last: 'Piza',email: 'jpiza@mail.com')
Person p2 = new Person(first: 'Juan', last: 'Piza',email: 'jpiza@mailtwo.com')

assert p1 == p2
