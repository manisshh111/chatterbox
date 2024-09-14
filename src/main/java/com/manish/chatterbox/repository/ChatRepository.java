package com.manish.chatterbox.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manish.chatterbox.document.Chat;

public interface ChatRepository extends MongoRepository<Chat, String> {

}
