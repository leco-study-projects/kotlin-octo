package com.leco.kotlinocto.converters

import com.leco.kotlinocto.resources.request.Issue
import com.leco.kotlinocto.resources.request.IssueRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class IssueRequestToDomain : Converter<IssueRequest, Issue> {

    val userRequestRequestToDomain: UserRequestToDomain

    @Autowired
    constructor(userRequestRequestToDomain: UserRequestToDomain) {
        this.userRequestRequestToDomain = userRequestRequestToDomain
    }


    override fun convert(source: IssueRequest): Issue? {
        val issue = Issue()

        issue.comments = source.comments
        issue.closedAt = source.closedAt
        issue.createdAt = source.createdAt
        issue.title = source.title
        issue.url = source.url
        issue.labels_url = source.labels_url
        issue.authorAssociation = source.authorAssociation
        issue.number = source.number
        issue.updatedAt = source.updatedAt
        issue.eventsUrl = source.eventsUrl
        issue.htmlUrl = source.htmlUrl
        issue.commentsUrl = source.commentsUrl
        issue.repositoryUrl = source.repositoryUrl
        issue.gitHubId = source.gitHubId
        issue.state = source.state
        issue.user = userRequestRequestToDomain.convert(source.userRequest!!)
        issue.nodeId = source.nodeId
        issue.user?.issue = issue

        return issue
    }
}
