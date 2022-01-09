package br.com.mvc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.mvc.model.Security.Database.AutoridadeStatus;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/home")
			.permitAll()
		.anyRequest()
			.authenticated()
		.and()
		.formLogin(form -> form
            .loginPage("/login")
            .defaultSuccessUrl("/usuario/pedido", true)
            .permitAll()
        )
		.logout(logout -> {
			logout.logoutUrl("/logout")
				.logoutSuccessUrl("/home");
		});
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		UserDetails usuario = User.builder()
				.username("yann")
				.password(encoder.encode("1234"))
				.roles(AutoridadeStatus.ROLE_ADMINISTRADOR.toString())
				.build();


		auth.jdbcAuthentication().dataSource(dataSource)
				.passwordEncoder(encoder)
				.withUser(usuario);

				usuario = User.builder()
				.username("joao")
				.password(encoder.encode("1234"))
				.roles(AutoridadeStatus.ROLE_ADMINISTRADOR.toString())
				.build();


		auth.jdbcAuthentication().dataSource(dataSource)
				.passwordEncoder(encoder)
				.withUser(usuario);

				usuario = User.builder()
				.username("maria")
				.password(encoder.encode("1234"))
				.roles(AutoridadeStatus.ROLE_USUARIO.toString())
				.build();

				auth.jdbcAuthentication().dataSource(dataSource)
				.passwordEncoder(encoder)
				.withUser(usuario);
	}
}