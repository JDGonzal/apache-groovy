/*
  Mapas
  ----------------------------------
  * Crear un mapa de días de la semana
    * 1: domingo, 2: lunes, etc...
  * Imprimir el mapa
  * Imprimir el nombre de la clase del mapa
  * Imprimir el tamaño del mapa
  * ¿Existe un método que imprima fácilmente todos los días (valores)?
      * Sin cierres (Closures), es posible que deba consultar la API de Java para LinkedHashMap
*/

// Crear un mapa de días de la semana
// * 1: domingo, 2: lunes, etc...
Map map = [1:'Sunday', 2:'Monday', 3:'Tuesday', 4:'Wednesday', 5:'Thursday', 6:'Friday', 7:'Saturday']

// Imprimir el mapa
println map // [1:Sunday, 2:Monday, 3:Tuesday, 4:Wednesday, 5:Thursday, 6:Friday, 7:Saturday]

// Imprimir el nombre de la clase del mapa
println map.getClass().getName()  // java.util.LinkedHashMap

// Imprimir el tamaño del mapa
println map.size()  // 7

// Sin cierres (Closures), es posible que deba consultar la API de Java para LinkedHashMap
println map.values()  // [Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
