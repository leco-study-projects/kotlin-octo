package com.leco.kotlinocto.resources.request

import com.fasterxml.jackson.annotation.JsonProperty

class EventsResponse {
    @JsonProperty("id")
    var id: String? = null

    @JsonProperty("issue")
    var issue: IssueResponse? = null

    @JsonProperty("action")
    var action: String? = null
}
