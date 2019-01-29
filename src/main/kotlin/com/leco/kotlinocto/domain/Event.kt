package com.leco.kotlinocto.domain

import java.util.*
import javax.persistence.*

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID? = null

    @OneToOne(mappedBy = "event", cascade = [CascadeType.ALL])
    var issue: Issue? = null

    var action: String? = null
}
