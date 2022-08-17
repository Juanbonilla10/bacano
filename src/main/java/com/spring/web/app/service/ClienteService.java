package com.spring.web.app.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.web.app.connection.DataSourceConnection;
import com.spring.web.app.entity.ClientEntity;
import com.spring.web.app.model.ResponseModel;




@Service
public class ClienteService {
	
	@Autowired
	private DataSourceConnection ds;
	
	public ResponseModel list(){
		
		ArrayList<ClientEntity> lists = new ArrayList();
		Connection cn = this.ds.openConnection();
		try {
			
			CallableStatement cs = cn.prepareCall("{call sp_GenPersonList()}");
			ResultSet rs = cs.executeQuery();
			
			while(rs.next()) {
				ClientEntity c = new ClientEntity();
				c.setId(rs.getInt("id"));
				lists.add(c);
				
			}
			cs.close();
			rs.close();
			cn.close();
		} catch (SQLException e) {
			return new ResponseModel(getClass().getSimpleName(), e.getMessage(), null, 200);
		}finally {
			try {
				cn.close();
			} catch (Exception e) {
				return new ResponseModel(getClass().getSimpleName(), e.getMessage(), null, 200);
			}
		}
		return new ResponseModel(getClass().getSimpleName(), "OK", lists, 200);
	}
	
}
