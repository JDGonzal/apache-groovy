package com.domain_name

// Every read access to a property can be intercepted by overriding a getProperty() method of the current object.
class PropertyDemo {
    // Some properties or attributes
    def prop1 = 'prop1'
    def prop2 = 'prop2'
    def prop3 = 'prop3'

    def getProperty(String name){
        println "getProperty() is called with argument $name"

        if(metaClass.hasProperty(this, name)) {
            // return
            metaClass.getProperty(this, name)
        } else {
            println 'lets do something fun with this property'
            return 'party time...'
        }
    }
}

def pd = new PropertyDemo()
println pd.prop1 // prop1
println pd.prop2 // prop2
println pd.prop3 // prop3
println pd.prop4 // No Exist
