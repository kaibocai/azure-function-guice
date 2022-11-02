package com.kc.component;

import com.kc.Function;
import com.kc.module.FunctionModule;
import dagger.Component;

@Component(modules = FunctionModule.class)
public interface FunctionComponent {
    Function buildFunction();
}
