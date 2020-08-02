package com.humuson.imc.agent.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.humuson.imc.agent.model.ImcBtRequest;

public class ImcBtRequestRowMapper implements RowMapper<ImcBtRequest> {

	@Override
	public ImcBtRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ImcBtRequest imcBtRequest = new ImcBtRequest();
		
		imcBtRequest.setId(rs.getLong("id"));
		imcBtRequest.setRequestAt(rs.getString("requestAt"));
		imcBtRequest.setRequestUid(rs.getString("requestUid"));
		imcBtRequest.setReportYn(rs.getString("reportYn"));
		imcBtRequest.setRetryCount(rs.getInt("retryCount"));
		imcBtRequest.setCreatedAt(rs.getString("createdAt"));
		imcBtRequest.setModifiedAt(rs.getString("modifiedAt"));
		
		return imcBtRequest;
	}
	
}
