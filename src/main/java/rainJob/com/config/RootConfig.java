package rainJob.com.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"rainJob.com.config"}, excludeFilters = {@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {

    @Bean(name = "org.dozer.Mapper")
    public DozerBeanMapper dozer() {
        List<String> mappingFiles = new ArrayList<>();
        mappingFiles.add("dozer/dozer-mappings-sys.xml");
        mappingFiles.add("dozer/dozer-mappings-syxy-index.xml");
//        mappingFiles.add("dozer/dozer-mappings-setting.xml");
        mappingFiles.add("dozer/dozer-mappings-api.xml");
        mappingFiles.add("dozer/dozer-mappings-document.xml");
        mappingFiles.add("dozer/dozer-mappings-api-manager.xml");
        mappingFiles.add("dozer/dozer-mappings-process.xml");
        DozerBeanMapper dozerBean = new DozerBeanMapper();
        dozerBean.setMappingFiles(mappingFiles);
        return dozerBean;
    }
}
