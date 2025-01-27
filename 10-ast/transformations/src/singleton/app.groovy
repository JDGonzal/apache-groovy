package singleton

// DatabaseConnection bdConn = new DatabaseConnection()
// println dbConn

DatabaseConnection db = DatabaseConnection.instance
println db
