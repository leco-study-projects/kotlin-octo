package com.leco.kotlinocto.services.contracts

import com.leco.kotlinocto.resources.request.UserRequest
import com.leco.kotlinocto.resources.response.UserResponse

interface UserService : CrudService<UserRequest, UserResponse> {
    fun findByLogin(login: String): List<UserResponse?>
}