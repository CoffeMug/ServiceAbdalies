import health.TemplateHealthCheck;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import resources.Resource;
import resources.UpdateResource;

/**
 * Created by majid on 30/08/16.
 */
public class Application extends io.dropwizard.Application<ServiceConfiguration> {
    public static void main(String[] args) throws Exception {
        new Application().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<ServiceConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(ServiceConfiguration configuration,
                    Environment environment) {
        final Resource resource = new Resource(configuration.getTemplate(), configuration.getDefaultName());
        final UpdateResource updateResource = new UpdateResource();
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
        environment.jersey().register(updateResource);
    }
}
