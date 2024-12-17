class Person {
  String firstName, lastName
  def dob
  // private | protected | public
  protected String f1, f2, f3
  private Date createOn = new Date()

  static welcomeMsg = 'HELLO'
  public static final String WELCOME_MSG = welcomeMsg

  // local variable
  def foo() {
    String msg = 'Hello'
    String firstName = "Dan"
    println "$msg, $firstName" // Hello, Dan
  }

}
println Person.WELCOME_MSG // HELLO
def person = new Person()
println person.foo() // null
