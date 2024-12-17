@groovy.transform.ToString
class Person {

  // Attributes
  String firstName, lastName

  // Constructor
  Person(String fullName) {
    List parts = fullName.split(' ')
    /* this. */ firstName = parts[0]
    /* this. */ lastName = parts[1]
  }

  // Methods
  public void foo(){
    // do stuff
  }
  String getFullName(){
    "$firstName LastName"
  }
  def concat(String... args){
    println args.length
  }

}

// Person p = new Person(firstName: 'Juan', lastName: 'Piza')
// println p // Person(Juan, Piza)
Person p = new Person('Juan Piza')
println p // Person(Juan, Piza, Juan LastName)
p.concat('a', 'b') // 2
