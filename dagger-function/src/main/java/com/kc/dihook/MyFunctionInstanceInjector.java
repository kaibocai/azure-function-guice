package com.kc.dihook;

import com.kc.component.DaggerFunctionComponent;
import com.microsoft.azure.functions.spi.inject.FunctionInstanceInjector;

public class MyFunctionInstanceInjector implements FunctionInstanceInjector {
    @Override
    public <T> T getInstance(Class<T> aClass) throws Exception {
        return (T) DaggerFunctionComponent.create().buildFunction();
    }
}
