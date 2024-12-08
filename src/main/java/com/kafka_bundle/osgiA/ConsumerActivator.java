package com.kafka_bundle.osgiA;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ConsumerActivator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("ConsumerBundle iniciado.");
        // Aquí puedes inicializar cualquier dependencia si es necesario
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("ConsumerBundle detenido.");
    }
}

