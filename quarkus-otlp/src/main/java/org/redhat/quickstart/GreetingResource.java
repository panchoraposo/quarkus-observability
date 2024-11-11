package org.redhat.quickstart;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
import io.opentelemetry.instrumentation.annotations.WithSpan;

@Path("/hello")
@ApplicationScoped
public class GreetingResource {

    private static final Logger LOG = Logger.getLogger(GreetingResource.class);

    @Inject
    MeterRegistry registry;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @WithSpan(value = "Not needed, will change the current span name")
    public String hello() {
        LOG.info("Hello");
        registry.counter("greeting_counter", Tags.of("hello", "hello")).increment();
        return "Hello from RESTEasy Reactive";
    }
}
