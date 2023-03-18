package com.libre.chatgpt.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: Libre
 * @Date: 2023/1/23 5:12 PM
 */
@Data
@ConfigurationProperties(prefix = "libre.chat")
public class ChatGPTProperties {

	private String url = "https://api.openai.com/v1/completions";

	private String apiKey = "****************";

}
