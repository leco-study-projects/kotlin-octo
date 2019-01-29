package com.leco.kotlinocto.services.implementation

import com.leco.kotlinocto.converters.UserRequestToDomain
import com.leco.kotlinocto.converters.UserToResponse
import com.leco.kotlinocto.repositories.UserRepository
import com.leco.kotlinocto.resources.request.UserRequest
import com.leco.kotlinocto.resources.response.UserResponse
import com.leco.kotlinocto.services.contracts.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl : UserService {
    val userRepository: UserRepository
    val userToReponse: UserToResponse
    val userRequestToDomain: UserRequestToDomain

    @Autowired
    constructor(userRepository: UserRepository, userToReponse: UserToResponse, userRequestToDomain: UserRequestToDomain) {
        this.userRepository = userRepository
        this.userToReponse = userToReponse
        this.userRequestToDomain = userRequestToDomain
    }

    override fun create(t: UserRequest): UserResponse? {
        return userToReponse.convert(userRepository.save(userRequestToDomain.convert(t)!!))
    }

    override fun delete(id: UUID) {
        userRepository.deleteById(id)
    }

    override fun findById(id: UUID): UserResponse? {
        return userToReponse.convert(userRepository.findById(id).orElse(null))
    }

    override fun findAll(): List<UserResponse?> {
        return userRepository.findAll().map { user -> userToReponse.convert(user) }
    }

    override fun findByLogin(login: String): List<UserResponse?> {
        return userRepository.findByLogin(login).map { user -> userToReponse.convert(user) }
    }


}