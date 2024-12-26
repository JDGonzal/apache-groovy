package com.domain_name.service

import com.domain_name.domain.Person

interface IPersonService {
    Person find()

    List<Person> findAll()
}