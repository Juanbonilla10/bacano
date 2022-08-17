package com.spring.web.app.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class DataSourceConnection {

	
	 	@Autowired
	    private Environment en;


	    @Primary
	    @Bean
	    public DataSource source() {

	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName(this.en.getProperty("spring.datasource.driver-class-name"));
	        dataSource.setUrl(this.en.getProperty("spring.datasource.url"));
	        dataSource.setUsername(this.en.getProperty("spring.datasource.username"));
	        dataSource.setPassword(this.en.getProperty("spring.datasource.password"));

	        return dataSource;
	    }
	    public Connection openConnection(){
	        try {
	            return source().getConnection();
	        } catch (SQLException ex) {
	            return null;
	        }
	    } 
	
}
