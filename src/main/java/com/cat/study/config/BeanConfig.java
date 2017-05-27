package com.cat.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/config.properties")
@Lazy
public class BeanConfig {

    @Autowired
    private Environment environment;
    private String name;
    @Value("${shop.name2}")
    private String name1;

    @Bean
    @Qualifier
    public Music music() {
        Music music = new Music();
        music.setName("night wish");
        music.setPrice(100.00);
        return music;
    }

    @Bean
    @Qualifier("f")
    public Film film() {
        Film film = new Film();
        film.setName("Go!");
        film.setTime(120);
        return film;
    }

    @Bean
    @Primary
    public Shop shop(@Autowired Music music, @Autowired Film film) {
        init();
        return new Shop(name1, music, film);
    }

    private void init() {
    }

    private void init2() {
        System.out.println(environment);
        environment.getActiveProfiles();
        name = environment.getProperty("shop.name");
        System.out.println(name);
        int id = environment.getProperty("shop.id", int.class);
        System.out.println(id);
    }

}
