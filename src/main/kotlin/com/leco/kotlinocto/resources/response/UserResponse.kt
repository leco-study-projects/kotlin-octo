package com.leco.kotlinocto.resources.response

import com.fasterxml.jackson.annotation.JsonProperty

class UserResponse {
    @JsonProperty("starred_url")
    var starredUrl: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("type")
    var type: String? = null

    @JsonProperty("url")
    var url: String? = null

    @JsonProperty("avatar_url")
    var avatarUrl: String? = null

    @JsonProperty("events_url")
    var eventsUrl: String? = null

    @JsonProperty("html_url")
    var htmlUrl: String? = null

    @JsonProperty("site_admin")
    var siteAdmin: Boolean? = null

    @JsonProperty("id")
    var id: String? = null
}
