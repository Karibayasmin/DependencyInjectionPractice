package com.kariba.dependencyinjectionpractice.di.module

import com.kariba.dependencyinjectionpractice.SQLUserRepository
import com.kariba.dependencyinjectionpractice.UserRepository
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
    @Singleton
    abstract fun getSQLRepository(sqlUserRepository: SQLUserRepository) : UserRepository
}