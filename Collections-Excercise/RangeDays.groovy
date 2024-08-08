/* groovylint-disable CompileStatic */
/*
  Rangos
  ------------------------------------
  * Crear un rango a partir de esa enumeración
  * Imprimir el tamaño del rango
  * Usar el método contains para ver si el miércoles está en ese rango
  * Imprimir el elemento `from` de este rango
  * Imprimir el elemento `to` de este rango
*/

enum Days {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
// Crear un rango a partir de esa enumeración
def dayRange = Days.SUNDAY..Days.SATURDAY
// Imprimir el tamaño del rango
println dayRange.size() // 7

// Usar el método contains para ver si el miércoles está en ese rango
println dayRange.contains(Days.WEDNESDAY) // true

// Imprimir el elemento `from` de este rango
println dayRange.from // SUNDAY

// Imprimir el elemento `to` de este rango
println dayRange.to // SATURDAY

// Adicional podemos imprimir el contenido
// for in loop
for (day in dayRange){
    print "$day |" // SUNDAY |MONDAY |TUESDAY |WEDNESDAY |THURSDAY |FRIDAY |SATURDAY |
}
println ' '

// using  clousures
dayRange.each{ day ->
    print "$day |" // SUNDAY |MONDAY |TUESDAY |WEDNESDAY |THURSDAY |FRIDAY |SATURDAY |
}
println ' '

// Bonus: next() and previous() are equivalent to
// ++ and -- operators.
/* groovylint-disable-next-line VariableTypeRequired */
def wed = Days.WEDNESDAY
assert Days.THURSDAY == ++wed
assert Days.WEDNESDAY == --wed
