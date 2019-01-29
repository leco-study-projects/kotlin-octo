package com.leco.kotlinocto.resources.response

import com.fasterxml.jackson.annotation.JsonProperty

class EventResponse {
    @JsonProperty("id")
    var id: String? = null

    @JsonProperty("issue")
    var issue: IssueResponse? = null

    @JsonProperty("action")
    var action: String? = null
}
