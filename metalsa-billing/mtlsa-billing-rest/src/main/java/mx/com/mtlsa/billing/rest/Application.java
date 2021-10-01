
package mx.com.mtlsa.billing.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

@ApplicationPath("/billing/v1/")
public class Application extends ResourceConfig {
    public Application() {
        packages("mx.com.mtlsa.billing.rest");
        register(RolesAllowedDynamicFeature.class);
    }
}