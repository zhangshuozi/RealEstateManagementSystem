package com.shuozi.config;

import com.shuozi.common.JacksonObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@Log4j2
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        log.info("扩展自己的消息转换器...");
//        创建消息转换器对象
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        设置对象转换器底层使用jackson把Java转换成json
        converter.setObjectMapper(new JacksonObjectMapper());
//        要把自己配置的放在最前面优先加载
        converters.add(0, converter);
    }

//    定义静态资源映射关系

//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("").addResourceLocations("");
//    }
}
