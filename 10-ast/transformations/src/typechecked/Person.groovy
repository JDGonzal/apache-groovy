package typechecked

import groovy.transform.TypeChecked

@TypeChecked
class Person {
    String firstName
    String lastName

    String getFullName(){
        "$firstName $lasName"  // Mal escrito el `lastName`
    }
}
