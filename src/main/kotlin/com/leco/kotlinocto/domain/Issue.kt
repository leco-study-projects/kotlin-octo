package com.leco.kotlinocto.resources.request

import javax.persistence.*

@Entity
class Issue {

    @Id
    var id: Int? = null

    var comments: Int? = null

    var closedAt: String? = null

    var createdAt: String? = null

    var title: String? = null

    var url: String? = null

    var labels_url: String? = null

    var authorAssociation: String? = null

    var number: Int? = null

    var updatedAt: String? = null

    var eventsUrl: String? = null

    var htmlUrl: String? = null

    var commentsUrl: String? = null

    var repositoryUrl: String? = null

    var gitHubId: Int? = null

    var state: String? = null

    @OneToOne
    @JoinColumn(name = "event_id")
    var event: Event? = null

    @OneToOne(mappedBy = "issue")
    var user: User? = null

    var nodeId: String? = null
}