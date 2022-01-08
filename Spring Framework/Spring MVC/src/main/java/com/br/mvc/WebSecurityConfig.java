package com.br.mvc;

import javax.sql.DataSource;

import com.br.mvc.model.Security.Database.AutoridadeStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.anyRequest().authenticated()
				.and()
				.formLogin()
				.loginPage("/login")
				.permitAll()
				.defaultSuccessUrl("/home", true)
				.and()
				.logout(logout -> logout.logoutUrl("/logout"))
				.csrf().disable();

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