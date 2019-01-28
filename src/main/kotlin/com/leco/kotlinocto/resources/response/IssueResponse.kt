package com.leco.kotlinocto.resources.request

import com.fasterxml.jackson.annotation.JsonProperty

class IssueResponse {
    @JsonProperty("comments")
    var comments: Int? = null

    @JsonProperty("closed_at")
    var closedAt: String? = null

    @JsonProperty("created_at")
    var createdAt: String? = null

    @JsonProperty("title")
    var title: String? = null

    @JsonProperty("author_association")
    var authorAssociation: String? = null

    @JsonProperty("number")
    var number: Int? = null

    @JsonProperty("updated_at")
    var updatedAt: String? = null

    @JsonProperty("repository_url")
    var repositoryUrl: String? = null

    @JsonProperty("state")
    var state: String? = null

    @JsonProperty("user")
    var user: User? = null

    @JsonProperty("node_id")
    var nodeId: String? = null

    @JsonProperty("id")
    var id: Int? = null
}