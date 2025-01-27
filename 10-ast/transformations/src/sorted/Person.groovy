package sorted

import groovy.transform.Canonical
import groovy.transform.Sortable

@Canonical
@Sortable(includes = ['last'])
class Person {
    String first
    String last
}
