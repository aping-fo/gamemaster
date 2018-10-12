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
 * @时间 2018/10/7 14:53
 */
@Configuration
@MapperScan(basePackages = {"com.luckygames.wmxz.gamemaster.dao.mapperNew"}, sqlSessionFactoryRef = "sqlSessionFactory2")
public class SecondConfig {
    @Resource
    @Qualifier("secondDataSource")
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory2() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);

        //设置驼峰命名映射
        org.apache.ibatis.session.Configuration configuration=new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        factoryBean.setConfiguration(configuration);

        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate2() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory2());
        return template;
    }
}
