package com.example.ATVHub;

import com.example.ATVHub.atv.Atv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class AtvHubApplication {

	//from thymeleaf tut
	private final TemplateEngine templateEngine;

	public static void main(String[] args) {


		SpringApplication.run(AtvHubApplication.class, args);
	}

	//from thymeleaf tut
	public AtvHubApplication(final ServletContext servletContext) {

		super();

		ServletContextTemplateResolver templateResolver =
				new ServletContextTemplateResolver(servletContext);

		// HTML is the default mode, but we set it anyway for better understanding of code
		templateResolver.setTemplateMode(TemplateMode.HTML);
		// This will convert "home" to "/WEB-INF/templates/index.html"
		templateResolver.setPrefix("/resources/templates/");
		templateResolver.setSuffix(".html");
		// Template cache TTL=1h. If not set, entries would be cached until expelled
		templateResolver.setCacheTTLMs(Long.valueOf(3600000L));

		// Cache is set to true by default. Set to false if you want templates to
		// be automatically updated when modified.
		templateResolver.setCacheable(true);

		this.templateEngine = new TemplateEngine();
		this.templateEngine.setTemplateResolver(templateResolver);
	}
}

