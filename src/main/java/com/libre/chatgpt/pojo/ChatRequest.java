package com.libre.chatgpt.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;;
import com.libre.chatgpt.ChatModel;
import lombok.Data;

import java.util.List;

/**
 * @author: Libre
 * @Date: 2023/1/23 3:46 AM
 */

@Data
public class ChatRequest {

	/**
	 * ID of the model to use. You can use the List models API to see all of your
	 * available models, or see our Model overview for descriptions of them.
	 */
	private String model;

	/**
	 * The prompt(s) to generate completions for, encoded as a string, array of strings,
	 * array of tokens, or array of token arrays. Note that <|endoftext|> is the document
	 * separator that the model sees during training, so if a prompt is not specified the
	 * model will generate as if from the beginning of a new document.
	 */
	private String prompt;


	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<Message> messages;

	/**
	 * What sampling temperature to use. Higher values means the model will take more
	 * risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones
	 * with a well-defined answer. We generally recommend altering this or top_p but not
	 * both
	 */
	private Double temperature = 0D;

	/**
	 * The maximum number of tokens to generate in the completion. The token count of your
	 * prompt plus max_tokens cannot exceed the model's context length. Most models have a
	 * context length of 2048 tokens (except for the newest models, which support 4096).
	 */
	@JsonProperty("max_tokens")
	private Integer maxTokens = 2048;

	/**
	 * An alternative to sampling with temperature, called nucleus sampling, where the
	 * model considers the results of the tokens with top_p probability mass. So 0.1 means
	 * only the tokens comprising the top 10% probability mass are considered. We
	 * generally recommend altering this or temperature but not both.
	 */
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("top_p")
	private Double topP;

	/**
	 * Whether to stream back partial progress. If set, tokens will be sent as data-only
	 * server-sent events as they become available, with the stream terminated by a data:
	 * [DONE] message.
	 */
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Boolean stream;

	/**
	 * How many completions to generate for each prompt. Note: Because this parameter
	 * generates many completions,it can quickly consume your token quota. Use carefully
	 * and ensure that you have reasonable settings for max_tokens and stop.
	 */
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer n;

	/**
	 * Include the log probabilities on the logprobs most likely tokens, as well the
	 * chosen tokens. For example, if logprobs is 5, the API will return a list of the 5
	 * most likely tokens. The API will always return the logprob of the sampled token, so
	 * there may be up to logprobs+1 elements in the response. The maximum value for
	 * logprobs is 5. If you need more than this, please contact us through our Help
	 * center and describe your use case.
	 */
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer logprobs;

	/**
	 * Up to 4 sequences where the API will stop generating further tokens. The returned
	 * text will not contain the stop sequence.
	 */
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String stop;

	public ChatRequest(String prompt) {
		this.prompt = prompt;
		this.model = ChatModel.TEXT_DAVINCI_003.getType();
	}

	public ChatRequest(String model, String prompt) {
		this.model = model;
		this.prompt = prompt;
	}

	@Data
	public static class Message {

		public String role;

		public String content;

	}

}
