@Grab('org.codehouse.groovy.modules.http-builder:http-builder:0.7.1')

import groovyx.net.http.RESTClient
import groovyx.net.http.ContentType

String base ='https://pokeapi.co/api/v2/'

def restClient= new RESTClient(base)
def params = [firstName: 'Juan', lastName: 'Piza']

restClient.contentType = ContentType.JSON

restClient.get(path: 'pokemon-species/', query: params){response, json ->
    println response.status
    println json
}
