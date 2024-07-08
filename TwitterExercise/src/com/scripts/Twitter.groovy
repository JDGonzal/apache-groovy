package com.scripts
import com.classes.Tweet
Tweet t = new Tweet()

t.from = "@JuanPiza"
t.message = "Mi primer Tweet"
t.isReTweet = true

t.sendTweet()
