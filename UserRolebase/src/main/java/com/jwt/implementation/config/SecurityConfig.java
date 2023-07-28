package com.jwt.implementation.config;


import com.jwt.implementation.service.DefaultUserService;
import org.hibernate.cfg.Environment;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

	@Autowired
	DefaultUserService userDetailsService;
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(userDetailsService);
		auth.setPasswordEncoder(passwordEncoder());
		return auth;
	}

	@Bean
	public AuthenticationManager authenticationManager(@NotNull AuthenticationConfiguration autheticationConfiguration)
			throws Exception {
		return autheticationConfiguration.getAuthenticationManager();
	}


	@Bean
	public SecurityFilterChain filterChain(@NotNull HttpSecurity http) throws Exception {
		        http.cors().and().csrf().disable()
				.authorizeRequests()
						.antMatchers("/user/api/registration","/user/api/genToken",
								"/api/user_mght/getAll" ,"/swagger-ui/**",
								"/v2/api-docs", "/swagger-resources/**", "/webjars/**").permitAll()
						//.antMatchers("/.*").permitAll()
				.anyRequest().authenticated()
				.and()
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				.and()
				.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}
	@Bean
    public JwtFilter authenticationTokenFilterBean() throws Exception {
        return new JwtFilter();
    }



}
