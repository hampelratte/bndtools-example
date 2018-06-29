package test.impl;

import org.osgi.service.component.annotations.Component;

import test.api.NoopService;

@Component
public class Noop implements NoopService {

    @Override
    public void doNothing() {
        System.out.println("I'm lazy");
    }

}
