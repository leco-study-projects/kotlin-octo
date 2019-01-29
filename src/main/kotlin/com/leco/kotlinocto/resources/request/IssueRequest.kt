package com.leco.kotlinocto.resources.request

import com.fasterxml.jackson.annotation.JsonProperty

class IssueRequest {
    @JsonProperty("comments")
    var comments: Int? = null

    @JsonProperty("closed_at")
    var closedAt: String? = null

    @JsonProperty("created_at")
    var createdAt: String? = null

    @JsonProperty("title")
    var title: String? = null

    @JsonProperty("url")
    var url: String? = null

    @JsonProperty("labelsUrl")
    var labels_url: String? = null

    @JsonProperty("author_association")
    var authorAssociation: String? = null

    @JsonProperty("number")
    var number: Int? = null

    @JsonProperty("updated_at")
    var updatedAt: String? = null

    @JsonProperty("events_url")
    var eventsUrl: String? = null

    @JsonProperty("html_url")
    var htmlUrl: String? = null

    @JsonProperty("comments_url")
    var commentsUrl: String? = null

    @JsonProperty("repository_url")
    var repositoryUrl: String? = null

    @JsonProperty("id")
    var gitHubId: Int? = null

    @JsonProperty("state")
    var state: String? = null

    @JsonProperty("user")
    var userRequest: UserRequest? = null

    @JsonProperty("node_id")
    var nodeId: String? = null
}