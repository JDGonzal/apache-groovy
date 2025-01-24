// **Times Two**
// * Agregue un nuevo método a la clase Integer llamado `timesTwo`
Integer.metaClass.timesTwo = {delegate * 2}
// * Este método debería estar disponible para cualquier instancia de Integer
println 2.timesTwo()
println 4.timesTwo()
println 5.timesTwo()
println 10.timesTwo()

// * ¿Qué otro enfoque podemos adoptar para crear este método que sea un poco más controlado?
