def map = [:]
println map // [:]
println map.getClass().getName() // java.util.LinkedHashMap
// println map.class.name // Cannot get property 'name' on null object

def person = [first:"juan", last:"piza", email: "kcorreo@server.com"]
println person
// println person.class.name // Cannot get property 'name' on null object
println person.getClass().getName() // java.util.LinkedHashMap
println person.first // juan

person.twitter = "@jpiza"
println person // [first:juan, last:piza, email:kcorreo@server.com, twitter:@jpiza]

def emailKey = "emailAddress"
def twitter = [username:"@piza", (emailKey):"another@email.com"]
person.twitter = twitter
println person // [first:juan, last:piza, email:kcorreo@server.com, twitter:[username:@piza, emailAddress:another@email.com]]

println person.size()  // 4

// looping through person
for (entry in person){
  print entry
  print " | " // first=juan | last=piza | email=kcorreo@server.com | twitter={username=@piza, emailAddress=another@email.com} | 
}
println " "

for (key in person.keySet()){
  print "$key:${person[key]} |"
}
println " " // first:juan |last:piza |email:kcorreo@server.com |twitter:[username:@piza, emailAddress:another@email.com] | 
