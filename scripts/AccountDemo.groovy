/* groovylint-disable CompileStatic, ImplicitReturnStatement */
@groovy.transform.ToString
class Account {

  BigDecimal balance = 0.0
  String type = ''  // checking or savings

  BigDecimal deposit(BigDecimal amount) {
    this.balance += amount
  }

  BigDecimal withdraw(BigDecimal amount) {
    this.balance -= amount
  }

  BigDecimal plus(Account account) {
    balance: this.balance + account.balance
  }

}

Account checking = new Account(type:'Checking')
checking.deposit(100.00)
Account savings = new Account(type:'Savings')
savings.deposit(50.00)

println checking
println savings

BigDecimal total = checking + savings
println total
