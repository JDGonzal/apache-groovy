print "Por favor Ingrese su deporte favorito: " // Se que dice `team` de `equipo`

String sport = ''

System.in.withReader {reader ->
    sport = reader.readLine()
}

println ''
println " Tu deporte favorito es $sport"
