package projeto.divulgacao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {
	
	public OpenAPI openAPI() {
		  return new OpenAPI()
		          .info(new Info()
		                  .title("Divulgação de Serviços - Rest API")
		                  .description("API exemplo de uso de Springboot REST API")
		                  .version("1.0")
		                  .termsOfService("Termo de uso: Open Source")
		                  .license(new License()
		                          .name("Apache 2.0")
		                          .url("http://www.seusite.com.br")
		                  )
		          ).externalDocs(
		                  new ExternalDocumentation()
		                  .description("Gilvan")
		                  .url("http://www.seusite.com.br"));
	}
	
	/*
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/swagger-ui/**")
            .addResourceLocations("classpath:/swagger-ui/");
    } */

}
