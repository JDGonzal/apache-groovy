//**GroovyObject**
//* Cree una clase e implemente cada uno de los siguientes métodos desde la interfaz GroovyObject
class Developer {

    // Properties
    String first
    String last
    String email
    List languages

    // Constructor
    Developer(){

    }

    //   * invokeMethod
    def invokeMethod(String name, Object args){
        println "invokeMethod() called with args $args"
    }

    //   * getProperty
    def getProperty(String property){
        println 'getProperty called...'
        metaClass.getProperty(this, property)
    }

    //   * setProperty
    void setProperty(String property, Object newValue){
        println "setProperty() called with name $property and newValue $newValue"
        metaClass.setProperty(this, property, newValue)
    }

}
