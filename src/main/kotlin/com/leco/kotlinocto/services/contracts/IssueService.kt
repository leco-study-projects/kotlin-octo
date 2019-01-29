package com.leco.kotlinocto.services.contracts

import com.leco.kotlinocto.resources.request.IssueRequest
import com.leco.kotlinocto.resources.response.IssueResponse

interface IssueService : CrudService<IssueRequest, IssueResponse> {
    fun findByState(state: String): List<IssueResponse?>
    fun findByNumber(number: Int): List<IssueResponse?>
}