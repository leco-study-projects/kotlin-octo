package com.leco.kotlinocto.converters

import com.leco.kotlinocto.resources.request.User
import com.leco.kotlinocto.resources.request.UserRequest
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class UserRequestToDomain : Converter<UserRequest, User> {

    override fun convert(source: UserRequest): User? {
        var userDomain = User()
        userDomain.gistsUrl = source.gistsUrl
        userDomain.reposUrl = source.reposUrl
        userDomain.followingUrl = source.followingUrl
        userDomain.starredUrl = source.starredUrl
        userDomain.login = source.login
        userDomain.followersUrl = source.followersUrl
        userDomain.type = source.type
        userDomain.url = source.url
        userDomain.subscriptionsUrl = source.subscriptionsUrl
        userDomain.receivedEventsUrl = source.receivedEventsUrl
        userDomain.avatarUrl = source.avatarUrl
        userDomain.eventsUrl = source.eventsUrl
        userDomain.htmlUrl = source.htmlUrl
        userDomain.siteAdmin = source.siteAdmin
        userDomain.gitHubId = source.gitHubId
        userDomain.nodeId = source.nodeId
        userDomain.organizationsUrl = source.organizationsUrl
        return userDomain
    }

}
