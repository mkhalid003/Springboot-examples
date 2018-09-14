package com.demo.rest.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Component
public class OrderManagerRoute extends RouteBuilder {

	@Bean(name = "jsonProvider")
    public JacksonJsonProvider jsonProvider() {
        return new JacksonJsonProvider();
    }
	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from("cxfrs:http://localhost:8080?resourceClasses=com.demo.rest.service.OrderManagerRestService&bindingStyle=SimpleConsumer&providers=#jsonProvider")
		  .log("[OrderManagerRoute] Request recieved operationName: ${header.operationName}")
		  .toD("direct:${header.operationName}")
		.end();
		
		// routes that implement the REST services
	        from("direct:createOrder")
	            .bean("orderService", "createOrder")
	        .end();

	        from("direct:getOrder")
	            .bean("orderService", "getOrder(${header.id})")
	       .end();

	        from("direct:updateOrder")
	            .bean("orderService", "updateOrder")
	        .end();

	        from("direct:cancelOrder")
	            .bean("orderService", "cancelOrder(${header.id})")
	        .end();
	}
}
