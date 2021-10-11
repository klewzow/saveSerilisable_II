package com.gmail.klewzow;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface Save {
	String path() default "saveText.txt";

}
