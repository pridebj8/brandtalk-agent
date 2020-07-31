package com.humuson.imc.agent.config;


import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "imc.agent")
@ImportResource("${imc.agent.context-path}")
public class ImcAgentConfig {
	
	private boolean			showSql;
	private boolean			sendRun;
	private boolean			reportRun;
	private boolean			useBtBizMsg;
	
	private String			messageApiHost;
	private String			reportApiHost;
	private String			clientId;
	private String			apiKey;
	private String			senderCode;
	
	private String			bizMsgSenderKey;
	private int				bizMsgTtl;
	private String			bizMsgLogFormet;
	private int				bizMsgLogMoveExpired;
	private List<String>	bizMsgEtcColumnList;
	private boolean			bizMsgUseKoreaCountyCode;
	private String			btBizMsgResendMethod;
	
	private int				bundleCount;
	
	private String			tableNameBtList;
	private String			tableNameBtListLog;

}
