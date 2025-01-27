package equals

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode( excludes = ['email'])
class Person {
    String first
    String last
    String email

    // boolean equals(o) {
    //     if (this.is(o)) return true
    //     if (o == null || getClass() != o.class) return false

    //     Person person = (Person) o

    //     if (email != person.email) return false
    //     if (first != person.first) return false
    //     if (last != person.last) return false

    //     return true
    // }

    // int hashCode() {
    //     int result
    //     result = (first != null ? first.hashCode() : 0)
    //     result = 31 * result + (last != null ? last.hashCode() : 0)
    //     result = 31 * result + (email != null ? email.hashCode() : 0)
    //     return result
    // }
}
