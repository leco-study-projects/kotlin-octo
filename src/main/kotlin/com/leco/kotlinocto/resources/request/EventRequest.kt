package com.leco.kotlinocto.resources.request

import com.fasterxml.jackson.annotation.JsonProperty

class EventRequest {
    @JsonProperty("issue")
    var issueRequest: IssueRequest? = null

    @JsonProperty("action")
    var action: String? = null
}
