package br.com.digitalinnovation.stockquotesapi.config;

import br.com.digitalinnovation.stockquotesapi.controller.QuoteController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
@EnableWebFlux
public class WebConfig {

    @Bean
    public RouterFunction<ServerResponse> routeQuotes(QuoteController quoteHeadler) {
        return route(GET("/quotes"), quoteHeadler::getAllQuotes)
                .andRoute(GET("/last-quote"), quoteHeadler::getLastQuote);
    }

    @Bean
    CorsWebFilter corsFilter() {
        return new CorsWebFilter(exchange -> new CorsConfiguration().applyPermitDefaultValues());
    }
}
