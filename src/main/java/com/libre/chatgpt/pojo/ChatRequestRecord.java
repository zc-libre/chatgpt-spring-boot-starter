package com.libre.chatgpt.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author: Libre
 * @Date: 2023/1/23 6:06 PM
 */
@Data
public class ChatRequestRecord {

	private String question;

	private String response;

	private LocalDateTime createTime;

}
