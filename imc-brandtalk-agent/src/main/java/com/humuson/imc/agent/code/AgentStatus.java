package com.humuson.imc.agent.code;

import lombok.Getter;

@Getter
public enum AgentStatus {

	/*
	 * Campaign Status
	 */
	WATING("0"),
	TARGETING("1"),
	SENDING("2"),
	FINISH("3"),
	
	/*
	 * List Status
	 */
	READY("1"),
	REQUEST("2"),
	REPORT("3"),
	
	/*
	 * Common
	 */
	ERROR("9");
	
	private String status;
	
	private AgentStatus(String status) {
		this.status = status;
	}
	
}
