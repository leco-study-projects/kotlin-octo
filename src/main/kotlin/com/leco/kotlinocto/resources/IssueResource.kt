package com.leco.kotlinocto.resources

import com.leco.kotlinocto.resources.response.IssueResponse
import com.leco.kotlinocto.services.contracts.IssueService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RestController
@RequestMapping("/event/issue")
class IssueResource {

    val issueService: IssueService

    @Autowired
    constructor(issueService: IssueService) {
        this.issueService = issueService
    }


    @GetMapping
    fun findEvent(@PathParam("type") type: String, @PathParam("value") value: String): ResponseEntity<List<IssueResponse?>> {
        return when (type) {
            "number" -> ResponseEntity.ok(issueService.findByNumber(value.toInt()))
            "state" -> ResponseEntity.ok(issueService.findByState(value))
            else -> ResponseEntity.badRequest().build()
        }
    }
}
