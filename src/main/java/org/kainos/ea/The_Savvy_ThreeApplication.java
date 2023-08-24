package org.kainos.ea;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class The_Savvy_ThreeApplication extends Application<The_Savvy_ThreeConfiguration> {

    public static void main(final String[] args) throws Exception {
        new The_Savvy_ThreeApplication().run(args);
    }

    @Override
    public String getName() {
        return "The_Savvy_Three";
    }

    @Override
    public void initialize(final Bootstrap<The_Savvy_ThreeConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final The_Savvy_ThreeConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
