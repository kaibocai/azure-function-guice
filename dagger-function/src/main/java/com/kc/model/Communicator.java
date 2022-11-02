package com.kc.model;

import com.microsoft.azure.functions.ExecutionContext;

public class Communicator {
    private final String id;

    public Communicator(String id) {
        this.id = id;
    }

    public void communicate(ExecutionContext context){
        context.getLogger().info("message for inject communicator ID: " + id);
    }
}
