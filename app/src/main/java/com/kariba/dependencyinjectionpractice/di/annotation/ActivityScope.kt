package com.kariba.dependencyinjectionpractice.di.annotation

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier
import javax.inject.Scope

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class ActivityScope()
