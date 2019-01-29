package com.leco.kotlinocto.converters

import com.leco.kotlinocto.resources.request.Issue
import com.leco.kotlinocto.resources.request.IssueRequest
import com.leco.kotlinocto.resources.request.IssueResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class IssueToResponse : Converter<Issue, IssueResponse> {

    val userToResponse: UserToResponse

    @Autowired
    constructor(userToResponse: UserToResponse) {
        this.userToResponse = userToResponse
    }


    override fun convert(source: Issue): IssueResponse? {
        val issue = IssueResponse()

        issue.comments = source.comments
        issue.closedAt = source.closedAt
        issue.createdAt = source.createdAt
        issue.title = source.title
        issue.authorAssociation = source.authorAssociation
        issue.number = source.number
        issue.updatedAt = source.updatedAt
        issue.repositoryUrl = source.repositoryUrl
        issue.state = source.state
        issue.user = userToResponse.convert(source = source.user!!)
        issue.nodeId = source.nodeId

        return issue
    }
}
