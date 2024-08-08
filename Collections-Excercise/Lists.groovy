/* 
  Listas
  -----------------------------------------
  * Crear una lista de días (domingo - sábado)
  * Imprimir la lista
  * Imprimir el tamaño de la lista
  * Eliminar el sábado de la lista
  * Agregar el sábado nuevamente agregándolo a la lista
  * Imprimir el miércoles usando su índice
*/
// Crear una lista de días (domingo - sábado)
def days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']

// Imprimir la lista
println days // [Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]

// Imprimir el tamaño de la lista
println days.size()  // 7}

// Eliminar el sábado de la lista
days.removeAt(6)
println days //[Sunday, Monday, Tuesday, Wednesday, Thursday, Friday]

// Agregar el sábado nuevamente agregándolo a la lista
days << 'Saturday'
println days //[Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]

// Imprimir el miércoles usando su índice
println days[3] //Wednesday
