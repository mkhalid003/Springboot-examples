package com.demo.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.demo.model.Order;

@Path("/orders")
@Consumes(value = "application/xml,application/json")
@Produces(value = "application/xml,application/json")
public interface OrderManagerRestService {

	/**
     * The GET order by id operation
     */
    @GET
    @Path("/getOrder/{id}")
    Order getOrder(@PathParam("id") int orderId);

    /**
     * The PUT update order operation
     */
    @PUT
    @Path("/updateOrder")
    void updateOrder(Order order);

    /**
     * The POST create order operation
     */
    @POST
    @Path("/createOrder")
    String createOrder(Order order);

    /**
     * The DELETE cancel order operation
     */
    @DELETE
    @Path("/cancelOrder/{id}")
    void cancelOrder(@PathParam("id") int orderId);
}
