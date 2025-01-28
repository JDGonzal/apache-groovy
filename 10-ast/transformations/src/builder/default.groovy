package builder

Developer dev = Developer
    .builder()
    .firstName('Juan')
    .lastName('Piza')
    .middleInitial('G')
    .email('jpiza@mail.com')
    .hireDate(new Date())
    .languages(['Java', 'Groovy'])
    .build()

println dev
assert dev.firstName == 'Juan'
assert dev.lastName == 'Piza'
assert dev.languages.size() == 2
