// if( boolean expression) { //logic}

if (true) {
  println 'TRUE' // TRUE
}

if (true) println true // Ejemplo de sin corchetes // true

def age = 35
if (age >= 35) {
  println 'Puede ser Presidente' // Puede ser Presidente
}

// if () else
if (false) {
  println 'TRUE'
} else {
  println 'FALSE' // FALSE
}

def yourAge = 21
if (yourAge >= 21){
  println 'Puede comprar cerveza' // Puede comprar cerveza
} else {
  println 'Sin cerveza pa Ud.'
}

// Otro ejemplo con anidación
def someAge = 37
// if (someAge >= 21) {
//   println 'Puede comprar cerveza' // Puede comprar cerveza
// } else if (someAge >= 35) {
//   println 'Puede ser Presidente' // Aqui no entra,
// } else {
//   println 'Menor de ventiuno...'
// }
// En el anterior hay un detalle a corregir
if (someAge >= 21 && someAge < 35) {
  println 'Puede comprar cerveza' // 
} else if (someAge >= 35) {
  println 'Puede ser Presidente' // Puede ser Presidente,
} else {
  println 'Menor de ventiuno...'
}

// --------------------------------------------
// ternary operator (expression) `? true : false`
def name = 'Juan'
def isItJuan = (name.toUpperCase() == 'JUAN') ? 'Yes' : 'No'
println isItJuan // Yes
isItJuan = (name.toLowerCase() == 'JUAN') ? 'Yes' : 'No'
println isItJuan // No

def msg
def output = (msg != null) ? msg : 'Default message...'
println output // Default message...
def wichMsg = msg ?: 'Another default message...'
println wichMsg // Another default message...

// -----------------------------------------------
// Switch
def num = 5
switch (num) { // five
  case 1: println 'one'
    break
  case 2: println 'two'
    break
  case 3: println 'three'
    break
  case 4: println 'four'
    break
  case 5: println 'five' 
    break
  case 6: println 'six'
    break
  default : println 'Another number'
}
switch (num) { // num is Integer
  case Integer: println 'num is Integer' 
    break
  case Float: println 'num is Float'
    break
}
switch (num) { // num in in list [0, 5, 10]
  case 1..3: println 'in range 1..3'
    break
  case [0, 5, 10]: println 'num in in list [0, 5, 10]'
    break
}

// --------------------------------------------
// Usando el `in`
def validAges = 18..35
def age2Valid = 19
println age2Valid in validAges // true
