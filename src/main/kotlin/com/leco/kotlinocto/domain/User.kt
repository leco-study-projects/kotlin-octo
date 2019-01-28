package com.leco.kotlinocto.resources.request

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
class User {
    @Id
    var id: Int? = null

    @OneToOne
    @JoinColumn(name = "issue_id")
    var issue: Issue? = null

    var gistsUrl: String? = null

    var reposUrl: String? = null

    var followingUrl: String? = null

    var starredUrl: String? = null

    var login: String? = null

    var followersUrl: String? = null

    var type: String? = null

    var url: String? = null

    var subscriptionsUrl: String? = null

    var receivedEventsUrl: String? = null

    var avatarUrl: String? = null

    var eventsUrl: String? = null

    var htmlUrl: String? = null

    var siteAdmin: Boolean? = null

    var gitHubId: Int? = null

    var nodeId: String? = null

    var organizationsUrl: String? = null
}
