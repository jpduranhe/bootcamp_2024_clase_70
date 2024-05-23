package cl.bootcamp.modulo_70.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SecurityConfig {
	
	
	@Bean
    SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		
		String[] matchers = new String[] {"/public/**"};
		return http
				.authorizeHttpRequests(request -> 
        				request.requestMatchers(matchers).permitAll())
				
				.authorizeHttpRequests(request -> 
                		request.anyRequest().authenticated())			
				
				
				.sessionManagement(sessionManagement -> {
                    sessionManagement.sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
                    .maximumSessions(10)
                    .expiredUrl("/login");  
                sessionManagement.invalidSessionUrl("/login");
              })
                .formLogin((form)-> 
                		form
                		.loginPage("/login")
                        .defaultSuccessUrl("/home")
                        .permitAll()
                       ) 
                .logout(logout-> logout.permitAll())
                .csrf(csrf-> csrf.disable())
                .build();
	}
    @Bean
    public NoOpPasswordEncoder passwordEncoder() {
      return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
    @Bean
     WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers("/WEB-INF/jsp/**");
    }
}
