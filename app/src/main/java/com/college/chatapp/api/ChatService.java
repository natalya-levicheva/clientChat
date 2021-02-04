package com.college.chatapp.api;

import com.college.chatapp.dto.AuthDto;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ChatService {
    private static ChatService chatService;

    private Retrofit retrofit;

    private final String BASE_URL = "http://localhost:8080";

    public static ChatService getChatService(){
        if (chatService == null){
            chatService = new ChatService();
        }
        return chatService;
    }

    private ChatService(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private ChatApi getChatApi(){
        return retrofit.create(ChatApi.class);
    }


}
