package vn.com.ntq.ntqsocialnetwork.config.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import vn.com.ntq.ntqsocialnetwork.config.tiles.FreeMarkerTilesInitializer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "vn.com.ntq.ntqsocialnetwork" })
public class WebConfig extends WebMvcConfigurerAdapter {

	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/");
        registry.addResourceHandler("/img/**").addResourceLocations("/resources/img/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

    }
    
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        TilesViewResolver tilesViewResolver = new TilesViewResolver();
//        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setPrefix("/WEB-INF/view/");
//        //System.out.println("sssss");
        registry.viewResolver(tilesViewResolver);
    }

    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tiles = new TilesConfigurer();
        tiles.setDefinitions("/WEB-INF/view/tiles.xml");
        tiles.setCheckRefresh(true);
        tiles.setTilesInitializer(new FreeMarkerTilesInitializer());
        return tiles;
    }
}
