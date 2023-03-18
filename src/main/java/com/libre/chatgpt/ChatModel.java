package com.libre.chatgpt;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: Libre
 * @Date: 2023/1/23 4:01 AM
 */
@Getter
@AllArgsConstructor
public enum ChatModel {

	GPT_3_TURBO("gpt-3.5-turbo"),

	TEXT_DAVINCI_003("text-davinci-003"),

	GPT_4("gpt-4"),

	;

	private final String type;

}
