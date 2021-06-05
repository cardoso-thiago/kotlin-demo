package br.com.cardoso.model

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_EMPTY)
class Message {

    var message: String? = null
    var sender: String? = null
    var destination: String? = null

    constructor(message: String? = null, sender: String? = null, destination: String? = null) {
        this.message = message
        this.sender = sender
        this.destination = destination
    }
}