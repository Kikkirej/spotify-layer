package net.kikkirej.spotify.layer.security

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client


@Configuration
@EnableOAuth2Client
class SecurityConfig : WebSecurityConfigurerAdapter(){

    override fun configure(http: HttpSecurity?) {
        http?.antMatcher("/**")
                ?.authorizeRequests()
                ?.antMatchers("/", "/login**")
                ?.permitAll()
                ?.anyRequest()
                ?.authenticated()
    }
}