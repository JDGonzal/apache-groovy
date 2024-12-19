package com.domain_name.domain

@groovy.transform.ToString

class IPhone extends Phone{
    String iOSVersion // Nuevo Atributo

    def homeButtonPressed() { // Nuevo Método 1

    }
    def airPlay() { // Nuevo Método 2

    }
    @Override
    def powerOn() { // Redefino un método del padre

    }

}
