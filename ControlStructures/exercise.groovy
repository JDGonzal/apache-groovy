// * Crear una clase `Account`
class Account {

  // * Crear una propiedad de tipo `BigDecimal` llamada `balance` con un valor inicial de 0.0
  BigDecimal balance = 0.0

  // Crear un método llamado `deposit()`
  def deposit(BigDecimal amount) {
    // * Usar una estructura condicional para verificar el `ammount`
    if(amount<0){
      throw new Exception ('Desposit amount must be greater than 0')
    }
    balance += amount
  }

  // * Crear otro método llamado `deposit()` que tome una lista de montos
  def deposit(List amounts) {
    //* Usar un bucle `for` para recorrer estos montos y llamar a `deposit`
    for(amount in amounts){
      deposit(amount)
    }
  }
}

// Ahora que tenemos nuestra clase, probémosla. Puedes hacer todo esto en el mismo archivo
// * Crea una instancia de la clase Account
Account checking = new Account()
// * Deposita un monto válido
checking.deposit(10)
println( checking.balance) // 10.0
// * Deposita un monto inválido (¿qué sucede?)
try {
  checking.deposit(-20) 
} catch (Exception e){
  println e.message // Desposit amount must be greater than 0
}
println(checking.balance)

// * Deposita una lista de montos.
checking.deposit([1,5,10,20,50])
println(checking.balance) // 96.0
