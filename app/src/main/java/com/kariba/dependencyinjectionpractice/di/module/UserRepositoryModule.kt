package com.kariba.dependencyinjectionpractice.di.module

import com.kariba.dependencyinjectionpractice.SQLUserRepository
import com.kariba.dependencyinjectionpractice.UserRepository
import com.kariba.dependencyinjectionpractice.di.annotation.ActivityScope
import com.kariba.dependencyinjectionpractice.di.annotation.ApplicationScope
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    /*@Provides
    fun getFirebaseRepository() : UserRepository{
        return FirebaseRepository()
    }*/

    @Binds
    @ActivityScope
    abstract fun getSQLRepository(sqlUserRepository: SQLUserRepository) : UserRepository
}