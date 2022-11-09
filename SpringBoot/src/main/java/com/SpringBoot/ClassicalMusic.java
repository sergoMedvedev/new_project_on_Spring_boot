package com.SpringBoot;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singlton")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "hungarian Rhapso";
    }


    private ClassicalMusic(){}

    @Contract(value = " -> new", pure = true)
    public static @NotNull ClassicalMusic getClassicalMusic(){
        return  new ClassicalMusic();
    }
}

