package com.domain_name.service

import com.domain_name.domain.Person

class PersonService implements IPersonService{
    @Override
    Person find() {
        Person p = new Person(first: 'Juan', last: 'Piza')
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(first: 'Juan', last: 'Piza')
        Person p2 = new Person(first: 'Giov', last: 'Piza')
        [p1, p2]
    }
}
