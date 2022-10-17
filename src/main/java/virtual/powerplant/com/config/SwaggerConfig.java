//package virtual.powerplant.com.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.google.common.base.Predicate;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//	@Bean
//	public Docket postsApi() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select().
//				apis(RequestHandlerSelectors.basePackage("deqode.assessment.backend2")).
//				paths(PathSelectors.any()).
//				build().apiInfo(apiInfo());
//	}
//
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().
//				title("Virtual Power Plant System").
//				description("Swagger congiguration of Java Technical Assesment")
//				.version("1.0")
//				.license("Deqode")
//				.licenseUrl("https:www.apache.org./liecences/LIECENCE-2.0\"")
//				.contact(new Contact("Harish Ingole", "github.com",""))
//				.build();
//	}
//}