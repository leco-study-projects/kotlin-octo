package com.leco.kotlinocto.repositories

import com.leco.kotlinocto.resources.request.Issue
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface IssueRepository : JpaRepository<Issue, UUID> {
    fun findByState(state: String): List<Issue>
    fun findByNumber(number: Int): List<Issue>
}