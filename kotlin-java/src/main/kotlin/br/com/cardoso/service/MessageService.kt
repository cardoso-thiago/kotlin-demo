package br.com.cardoso.service

import br.com.cardoso.model.Message

interface MessageService {
    fun getMessages():List<Message>
}
