package com.demo.route;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TestRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		/*from("timer:mytimer?period={{timer.period}}")
        	.setBody(simple("{{greeting.word}}, this is Camel running in Spring Boot!"))
            .to("log:out")
         .end();   */

	}
}