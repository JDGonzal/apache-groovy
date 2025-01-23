package com.domain_name

// Groovy supports the concept of propertyMissing for intercepting failing property resolution attemps

class Foo{
    def propertyMissing(String name){
        "caught missing property: $name"
    }
}

println new Foo().bar

