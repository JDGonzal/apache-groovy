package com.domain_name

@groovy.transform.ToString
class Tweet {
    String post
    String username
    Date postDateTime

    private List favorites = []
    private List reTweets = []
    private List mentions = []
    private List hashtags = []

    void favorite(String username){
        favorites << username
    }
    List getFavorites(){
        favorites
    }

    void retweets(String username){
        reTweets << username
    }
    List getRetweets(){
        reTweets
    }

    List getMentions(){
        String pattern = /\B@[a-z0-9_-]+/
        post.findAll(pattern)
    }
    List getHashTags(){
        String pattern = ~/(?:\s|\A)[##]+([A-Za-z0-9-_]+)/
        post.findAll(pattern)
    }
}
