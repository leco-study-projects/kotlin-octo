package com.leco.kotlinocto.repositories

import com.leco.kotlinocto.resources.request.Issue
import com.leco.kotlinocto.resources.request.IssueRequest
import com.leco.kotlinocto.resources.request.IssueResponse
import com.leco.kotlinocto.services.contracts.CrudService
import org.springframework.data.jpa.repository.JpaRepository

interface IssueService : CrudService<IssueRequest, IssueResponse> {
    fun findByState(state: String): List<IssueResponse?>
    fun findByNumber(number: Int): List<IssueResponse?>
}