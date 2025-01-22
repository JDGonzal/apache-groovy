package com.domain_name

Tweet tweet = new Tweet(
        post: 'Estoy en un curso de Apache por @therealdanvega #Java #groovyLang',
        username: '@jpiza',
        postDateTime: new Date()
)
println tweet // com.domain_name.Tweet(Estoy en un curso de Apache, @jpiza, Day Mth ## HH:mm:ss COT YYYY)

tweet.favorite('@ApacheGroovy')
tweet.retweets('@ApacheGroovy')
println tweet.getFavorites() // [@ApacheGroovy]
println tweet.getRetweets() // [@ApacheGroovy]

println tweet.getMentions() // [@therealdanvega]
println tweet.getHashTags() // [ #Java,  #groovyLang]