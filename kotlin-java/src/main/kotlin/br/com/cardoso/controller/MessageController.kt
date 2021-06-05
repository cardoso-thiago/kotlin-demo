package br.com.cardoso.controller

import br.com.cardoso.model.Message
import br.com.cardoso.service.MessageService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(private val messageService: MessageService) {

    @GetMapping("/messages")
    fun getMessages(): ResponseEntity<List<Message>> {
        return ResponseEntity.ok(messageService.getMessages())
    }
}