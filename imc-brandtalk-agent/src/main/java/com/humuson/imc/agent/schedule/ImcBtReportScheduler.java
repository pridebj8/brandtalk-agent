package com.humuson.imc.agent.schedule;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(name = "imc.agent.report-run", matchIfMissing = false)
public class ImcBtReportScheduler implements Scheduler{
	
	@Override
	public void scheduled() {
		// TODO Auto-generated method stub
		
	}

}
