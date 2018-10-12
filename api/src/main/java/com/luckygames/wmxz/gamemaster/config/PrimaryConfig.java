package com.luckygames.wmxz.gamemaster.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @作者 周聪
 * @时间 2018/10/7 14:50
 */
@Configuration
@MapperScan(basePackages = {"com.luckygames.wmxz.gamemaster.dao.mapper"}, sqlSessionFactoryRef = "sqlSessionFactory1")
public class PrimaryConfig {

    @Resource
    @Qualifier("primaryDataSource")
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource); // 使用主数据源, 连接主数据库

        //设置驼峰命名映射
        org.apache.ibatis.session.Configuration configuration=new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        factoryBean.setConfiguration(configuration);

        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory1()); // 使用上面配置的Factory
    }
}