package com.libre.chatgpt.config;

import com.libre.chatgpt.service.ChatGPTService;
import com.libre.chatgpt.service.ChatGPTServiceImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Libre
 * @Date: 2023/1/23 5:12 PM
 */
@AutoConfiguration
@EnableConfigurationProperties(ChatGPTProperties.class)
public class ChatGPTAutoConfiguration {

    @Bean
    public ChatGPTService chatGPTService(ChatGPTProperties properties) {
        return new ChatGPTServiceImpl(properties);
    }
}
