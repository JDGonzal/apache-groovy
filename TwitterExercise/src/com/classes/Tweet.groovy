package com.classes
@groovy.transform.ToString()

class Tweet {
    String from
    String message
    Boolean isLike =false
    Boolean isReTweet =false

    void sendTweet(){
        println("From: $from \n $message \n Like: $isLike \n ReTweet: $isReTweet")
    }
}
