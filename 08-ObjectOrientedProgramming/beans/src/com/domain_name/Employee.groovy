package com.domain_name

import groovy.transform.ToString

@ToString
class Employee implements Serializable{
    String first, last, email

    String fullName

    void setFullName( String first, String last){
        fullName = first + ' ' + last
    }

    String getFullName(){
        "Full name ${fullName}"
    }

}
