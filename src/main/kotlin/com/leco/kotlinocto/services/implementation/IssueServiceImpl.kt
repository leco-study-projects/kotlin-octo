package com.leco.kotlinocto.services.implementation

import com.leco.kotlinocto.converters.IssueRequestToDomain
import com.leco.kotlinocto.converters.IssueToResponse
import com.leco.kotlinocto.repositories.IssueRepository
import com.leco.kotlinocto.resources.request.IssueRequest
import com.leco.kotlinocto.resources.response.IssueResponse
import com.leco.kotlinocto.services.contracts.IssueService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class IssueServiceImpl : IssueService {
    val issueRepository: IssueRepository
    val issueToResponse: IssueToResponse
    val issueRequestToDomain: IssueRequestToDomain

    @Autowired
    constructor(issueRepository: IssueRepository, issueToResponse: IssueToResponse, issueRequest: IssueRequestToDomain) {
        this.issueRepository = issueRepository
        this.issueToResponse = issueToResponse
        this.issueRequestToDomain = issueRequest
    }

    override fun findByState(state: String): List<IssueResponse?> {
        return issueRepository.findByState(state).map { issue -> issueToResponse.convert(issue) }
    }

    override fun findByNumber(number: Int): List<IssueResponse?> {
        return issueRepository.findByNumber(number).map { issue -> issueToResponse.convert(issue) }
    }

    override fun create(t: IssueRequest): IssueResponse? {
        return issueToResponse.convert(issueRepository.save(issueRequestToDomain.convert(t)!!))
    }

    override fun delete(id: UUID) {
        issueRepository.deleteById(id)
    }

    override fun findById(id: UUID): IssueResponse? {
        return issueToResponse.convert(issueRepository.findById(id).orElse(null))
    }

    override fun findAll(): List<IssueResponse?> {
        return issueRepository.findAll().map { issue -> issueToResponse.convert(issue) }
    }


}