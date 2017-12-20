package rainJob.com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc    //启动SpringMVC
@ComponentScan("rainJob.com")
public class WebConfig extends WebMvcConfigurationSupport {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("view/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        // 开启默认转发
        configurer.enable();
    }

    @Override
    public void setApplicationContext(@Nullable ApplicationContext applicationContext) {
//        applicationContext = new ClassPathXmlApplicationContext("classpath:/application.xml");
        super.setApplicationContext(applicationContext);
    }


    @Override
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        RequestMappingHandlerMapping requestMappingHandlerMapping = super.requestMappingHandlerMapping();
        requestMappingHandlerMapping.setUseSuffixPatternMatch(false);
        requestMappingHandlerMapping.setUseTrailingSlashMatch(false);
        return requestMappingHandlerMapping;
    }

    /**
     * 描述 : <HandlerMapping需要显示声明，否则不能注册资源访问处理器>. <br>
     * <p>
     * <这个比较奇怪, 理论上应该是不需要的>
     * </p>
     *
     * @return
     **/


    @Bean
    public HandlerMapping resourceHandlerMapping() {
        return super.resourceHandlerMapping();
    }


/**
 * 描述 : <资源访问处理器>. <br>
 * <p>
 * <可以在jsp中使用/static/**
 * 的方式访问/WEB-INF/static/下的内容>
 * </p>
 *
 * @param registry
 * @Override protected void addResourceHandlers(ResourceHandlerRegistry registry) {
 * logger.info("addResourceHandlers");
 * registry.addResourceHandler("/static/**").addResourceLocations("/resources/static/");
 * }
 * <p>
 * <p>
 * 描述 : <文件上传处理器>. <br>
 * <p>
 * <使用方法说明>
 * </p>
 * @return
 * @Bean(name = "multipartResolver")
 * public CommonsMultipartResolver commonsMultipartResolver() {
 * logger.info("CommonsMultipartResolver");
 * return new CommonsMultipartResolver();
 * }
 * <p>
 * <p>
 * 描述 : <RequestMappingHandlerAdapter需要显示声明，否则不能注册通用属性编辑器>. <br>
 * <p>
 * <这个比较奇怪,理论上应该是不需要的>
 * </p>
 * @return
 * @Bean public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
 * logger.info("RequestMappingHandlerAdapter");
 * return super.requestMappingHandlerAdapter();
 * }
 * <p>
 * <p>
 * <p>
 * 描述 : <注册通用属性编辑器>. <br>
 * <p>
 * <这里只增加了字符串转日期和字符串两边去空格的处理>
 * </p>
 * @return
 * @Override protected ConfigurableWebBindingInitializer getConfigurableWebBindingInitializer() {
 * logger.info("ConfigurableWebBindingInitializer");
 * ConfigurableWebBindingInitializer initializer = super.getConfigurableWebBindingInitializer();
 * CP_PropertyEditorRegistrar register = new CP_PropertyEditorRegistrar();
 * register.setFormat("yyyy-MM-dd");
 * initializer.setPropertyEditorRegistrar(register);
 * return initializer;
 * }
 * <p>
 *
*/
}