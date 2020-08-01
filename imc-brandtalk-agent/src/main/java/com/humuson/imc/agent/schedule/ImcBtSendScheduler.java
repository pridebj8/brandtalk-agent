package com.humuson.imc.agent.schedule;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(name = "imc.agent.send-run", matchIfMissing = false)
public class ImcBtSendScheduler implements Scheduler {

	@Override
	public void scheduled() {
		// TODO Auto-generated method stub
		
	}

}
