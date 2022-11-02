package com.kc;

import com.google.inject.AbstractModule;

import javax.inject.Singleton;

public class BasicModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Communicator.class).to(DefaultCommunicatorImpl.class);
    }
}
