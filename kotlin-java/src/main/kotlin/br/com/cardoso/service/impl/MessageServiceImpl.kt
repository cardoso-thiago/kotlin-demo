package br.com.cardoso.service.impl

import br.com.cardoso.ReadMessages
import br.com.cardoso.model.Message
import br.com.cardoso.service.MessageService
import org.springframework.stereotype.Service

@Service
class MessageServiceImpl : MessageService {

    override fun getMessages(): List<Message> {
        val fileLines = ReadMessages().readContentFromFile()

        val messageList = getMessageList(fileLines)
//        for(message in messageList) {
//            if(message.destination?.length!! == 0){
//                println("${message.message} não possui destinatário.")
//            }
//            if(message.sender?.length!! == 0){
//                println("${message.message} não possui remetente.")
//            }
//        }
        return messageList
    }

    fun getMessageList(fileLines: MutableList<String>): List<Message> {
        val messageList = mutableListOf<Message>()
        for (line in fileLines) {
            val split = line.split(":")
            if (split.size == 1) {
                messageList.add(Message(message = split[0]))
            } else if (split.size == 2) {
                messageList.add(Message(message = split[0], destination = split[1]))
            } else if (split.size > 2) {
                messageList.add(Message(split[0], split[1], split[2]))
            }
        }
        return messageList
    }
}