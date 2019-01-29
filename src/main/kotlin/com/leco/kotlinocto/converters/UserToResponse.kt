package com.leco.kotlinocto.converters

import com.leco.kotlinocto.resources.request.User
import com.leco.kotlinocto.resources.request.UserRequest
import com.leco.kotlinocto.resources.request.UserResponse
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class UserToResponse : Converter<User, UserResponse> {

    override fun convert(source: User): UserResponse? {
        val userResponse = UserResponse()
        userResponse.id = source.id.toString()
        userResponse.starredUrl = source.starredUrl
        userResponse.login = source.login
        userResponse.type = source.type
        userResponse.url = source.url
        userResponse.avatarUrl = source.avatarUrl
        userResponse.eventsUrl = source.eventsUrl
        userResponse.htmlUrl = source.htmlUrl
        userResponse.siteAdmin = source.siteAdmin
        return userResponse
    }

}
