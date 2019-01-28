package com.leco.kotlinocto.resources.request

import com.fasterxml.jackson.annotation.JsonProperty

class UserRequest {
    @JsonProperty("gists_url")
    var gistsUrl: String? = null

    @JsonProperty("repos_url")
    var reposUrl: String? = null

    @JsonProperty("following_url")
    var followingUrl: String? = null

    @JsonProperty("starred_url")
    var starredUrl: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("followers_url")
    var followersUrl: String? = null

    @JsonProperty("type")
    var type: String? = null

    @JsonProperty("url")
    var url: String? = null

    @JsonProperty("subscriptions_url")
    var subscriptionsUrl: String? = null

    @JsonProperty("received_events_url")
    var receivedEventsUrl: String? = null

    @JsonProperty("avatar_url")
    var avatarUrl: String? = null

    @JsonProperty("events_url")
    var eventsUrl: String? = null

    @JsonProperty("html_url")
    var htmlUrl: String? = null

    @JsonProperty("site_admin")
    var siteAdmin: Boolean? = null

    @JsonProperty("id")
    var gitHubId: Int? = null

    @JsonProperty("node_id")
    var nodeId: String? = null

    @JsonProperty("organizations_url")
    var organizationsUrl: String? = null
}
