package com.libre.chatgpt.service;


import com.libre.chatgpt.pojo.ChatRequest;

/**
 * @author: Libre
 * @Date: 2023/1/23 5:13 PM
 */
public interface ChatGPTService {

	String request(String prompt);

	String request(ChatRequest request);

}
