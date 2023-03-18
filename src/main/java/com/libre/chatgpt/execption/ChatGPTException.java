package com.libre.chatgpt.execption;

/**
 * @author: Libre
 * @Date: 2023/3/18 11:18 PM
 */
public class ChatGPTException extends RuntimeException {

    public ChatGPTException(String message) {
        super(message);
    }

    public ChatGPTException(String message, Throwable cause) {
        super(message, cause);
    }
}
