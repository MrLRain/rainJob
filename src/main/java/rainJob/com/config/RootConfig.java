package rainJob.com.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaoyu
 * @Date: 11:36 2018/3/30
 * @Description:
 * @ModifyBy:
 */
@Configuration
@ComponentScan(basePackages = {"rainJob.com"}, excludeFilters = {@Filter(type = FilterType.ANNOTATION, value = {EnableWebMvc.class,RestController.class,Service.class,Repository.class})})
public class RootConfig {

    @Bean(name = "org.dozer.Mapper")
    public DozerBeanMapper dozer() {
        List<String> mappingFiles = new ArrayList<>();
        mappingFiles.add("dozer/dozer-mappings-user.xml");
        DozerBeanMapper dozerBean = new DozerBeanMapper();
        dozerBean.setMappingFiles(mappingFiles);
        return dozerBean;
    }
}
