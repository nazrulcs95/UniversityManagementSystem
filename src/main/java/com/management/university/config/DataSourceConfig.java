/*
 * package com.management.university.config;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.boot.jdbc.DataSourceBuilder; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * @Configuration public class DataSourceConfig {
 * 
 * @Bean public DataSource getDataSource() { DataSourceBuilder<?>
 * dataSourceBuilder = DataSourceBuilder.create();
 * //dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
 * //dataSourceBuilder.url("jdbc:mysql://localhost:3306/university_manager");
 * dataSourceBuilder.url("jdbc:h2:mem:testDb");
 * //dataSourceBuilder.username("root"); //dataSourceBuilder.password("");
 * return dataSourceBuilder.build(); } }
 */