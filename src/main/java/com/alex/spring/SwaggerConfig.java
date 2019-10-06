package com.alex.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket SwaggerDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.alex.spring")).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("spring-hibernate-example").version("0.0.1-SNAPSHOT").build();
    }


//    @Bean
//    public Docket api() {
//        // @formatter:off
//        //Register the controllers to swagger
//        //Also it is configuring the Swagger Docket
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                // .apis(RequestHandlerSelectors.any())
//                .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
//                // .paths(PathSelectors.any())
//                // .paths(PathSelectors.ant("/swagger2-demo"))
//                .build();
//        // @formatter:on
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry)
//    {
//        //enabling swagger-ui part for visual documentation
//        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
}
