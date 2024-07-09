// Sin esto el imprimir la no sería clara
@groovy.transform.ToString()
class Tweet {
    // Definimos propiedades
    String username // ej. @juanpiza
    String text
    Integer retweets
    Integer favorites
    Date createOn
    
    // Creamos el constructor
    public Tweet( String user, String tweet ) {
        username = user
        text = tweet
        retweets = 0
        favorites = 0
        createOn = new Date()
    }
    
    // Creamos un método para añadir retweets
    void addToRetweets() {
        retweets += 1 
    }
    
    // Creamos un método para añadir favoritos
    void addToFavorites() {
        favorites += 1 
    }

}
