package com.leco.kotlinocto.repositories

import com.leco.kotlinocto.resources.request.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : JpaRepository<User, UUID> {
    fun findByLogin(login: String): List<User>
}