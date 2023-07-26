# IMS_MICROSERVICES
Architecture Design: 
System Architecture and Design: 
The insurance management system will be designed using a microservices architecture, where different functionalities are divided into separate, loosely coupled microservices. Spring Microservices and Spring Cloud components will be utilized to enable communication and coordination among these microservices. The system will be deployed on AWS EC2 instances, and Spring Cloud Load Balancer or AWS Elastic Load Balancer will be used for load balancing. 
The high-level architecture will consist of the following microservices: 



##################


#Policy Management Microservice: 
Responsible for managing insurance policies. 
Handles policy creation, updates, retrieval, and listing. 
Communicates with the User Management Microservice for authentication and authorization. 




####################


#Claims Microservice: 
Manages insurance claims and their processing. 
Handles claim creation, updates, and retrieval. 
Communicates with the Policy Management Microservice for claim-policy associations. 



####################


#User Management Microservice: 
Handles user registration, authentication, and authorization. 
Manages user roles and permissions. 
Provides access tokens for secure API access. 
Reporting and Analytics Microservice: 
Generates various reports and provides analytics on policies and claims. 
Offers insights into policy trends, claim patterns, etc. 
Communicates with other microservices to fetch data. 



#####################


#API Gateway (Optional): 
Acts as the single entry point for external clients to access the microservices. 
Handles routing and load balancing of incoming requests. 
Implements security, throttling, and other cross-cutting concerns. 
Data Model for the Insurance System: 
The data model will consist of several entities, representing different aspects of the insurance system. Here's an outline of the data model: 


#################


#Policy Entity: 
policyId (Primary Key): Unique identifier for each policy. 
policyNumber: Unique policy number assigned to the policy. 
policyHolderName: Name of the policy holder. 
premiumAmount: Premium amount associated with the policy. 
startDate: Effective start date of the policy. 
endDate (Optional): Effective end date of the policy (null for ongoing policies). 


##################


#Claim Entity: 
claimId (Primary Key): Unique identifier for each claim. 
claimNumber: Unique claim number assigned to the claim. 
description: Description of the claim incident. 
incidentDate: Date of the incident triggering the claim. 
status: Status of the claim (e.g., open, in progress, closed). 
policyId (Foreign Key): Reference to the associated policy. 


###################


#User Entity: 
userId (Primary Key): Unique identifier for each user. 
username: Username for logging into the system. 
password: Securely hashed password for user authentication. 
roles: Set of roles assigned to the user (e.g., admin, manager, agent). 



###################


#Role Entity: 
roleId (Primary Key): Unique identifier for each role. 
roleName: Name of the role (e.g., admin, manager, agent). 
The above entities represent a simplified data model. Depending on the system's complexity and additional features, the data model may need further refinement and expansion. 
 

 
 Swagger2
#########################################



       <!--springfox dependencies for api documentations in swagger -->




       
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>3.0.0</version>
        </dependency>



        
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>3.0.0</version>
        </dependency>



        
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-boot-starter</artifactId>
            <version>3.0.0</version>
        </dependency>


################################
// create one configure package and create one class 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class SwaggerConfig implements WebMvcConfigurer {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.companyname.app"))//your path like com.takeo
                .paths(PathSelectors.regex("/.*")) // just change your api
                .build().apiInfo(apiInfoMetaData());
    }

    private ApiInfo apiInfoMetaData() {

        return new ApiInfoBuilder().title("NAME OF SERVICE")
                .description("API Endpoint Decoration")
                .contact(new Contact("Dev-Team", "https://www.dev-team.com/", "dev-team@gmail.com"))
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0.0")
                .build();
    }

}

########################
Add in properties file 
spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER



#########################
http://localhost:{port}/your-context-path/swagger-ui/index.html
//port change and copy past in your browser after spring boot running perfectly
EG:http:
// User
#//localhost:8086/swagger-ui/index.html
//Claim
#http://localhost:8084/swagger-ui/index.html
//Policy
#http://localhost:8084/swagger-ui/index.html






