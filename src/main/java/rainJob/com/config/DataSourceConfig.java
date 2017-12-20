/*
package rainJob.com.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
//加载资源文件
@PropertySource({"classpath:application.xml"})
public class DataSourceConfig {
    private static final Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);
    */
/*
     * 绑定资源属性
     *//*

    @Value("${jdbc.driver}")
    String driverClass;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.username}")
    String userName;
    @Value("${jdbc.password}")
    String passWord;

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        logger.info("DataSource");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(passWord);
        return dataSource;
    }
}*/
