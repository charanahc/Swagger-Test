//package com.example.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//
//@Configuration
//public class DatasourceConfig {
//
//	@SuppressWarnings("rawtypes")
//	@Profile("pga")
//	@Bean("datasource")
//	public DataSource pgaDataSource() {
//		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//		return dataSourceBuilder.build();
//	}
//
//	@SuppressWarnings("rawtypes")
//	@Profile("tga")
//	@Bean("datasource")
//	public DataSource tgaDataSource() {
//		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//		return dataSourceBuilder.build();
//	}
//
//	@Bean
//	public LocalSessionFactoryBean sessionFactory() {
//		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//		return sessionFactory;
//	}
//
//	@Bean
//	public JdbcTemplate jdbcTemplate(@Qualifier("datasource") DataSource datasource) {
//		return new JdbcTemplate(datasource);
//	}
//
//}
