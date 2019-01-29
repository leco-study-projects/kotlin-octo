package com.leco.kotlinocto.repositories

import com.leco.kotlinocto.resources.request.User
import com.leco.kotlinocto.resources.request.UserRequest
import com.leco.kotlinocto.resources.request.UserResponse
import com.leco.kotlinocto.services.contracts.CrudService

interface UserService : CrudService<UserRequest, UserResponse> {
    fun findByLogin(login: String): List<UserResponse?>
}