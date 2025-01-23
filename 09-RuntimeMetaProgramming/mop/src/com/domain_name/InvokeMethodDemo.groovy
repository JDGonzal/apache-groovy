package com.domain_name

// this method is called when the method you called si not presen on Groovy object
class InvokeDemo {

    def invokeMethod(String name,Object args){
        return "called invokeMethod $name $args"
    }
    def test(){
        return 'method exist'
    }
}

def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == 'method exist'
assert invokeDemo.someMethod() == 'called invokeMethod someMethod []'
