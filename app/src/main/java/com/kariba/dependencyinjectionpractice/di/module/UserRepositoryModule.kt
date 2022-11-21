package com.kariba.dependencyinjectionpractice.di.module

import com.kariba.dependencyinjectionpractice.SQLUserRepository
import com.kariba.dependencyinjectionpractice.UserRepository
import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    /*@Provides
    fun getFirebaseRepository() : UserRepository{
        return FirebaseRepository()
    }*/

    @Binds
    abstract fun getSQLRepository(sqlUserRepository: SQLUserRepository) : UserRepository
}