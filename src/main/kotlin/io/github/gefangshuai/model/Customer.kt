package io.github.gefangshuai.model

import javax.persistence.*

/**
 * Created by gefangshuai on 2017/3/8.
 */
@Entity
@Table(name = "customer")
class Customer constructor(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long = 1,
        var firstName: String = "",
        var lastName: String = ""
        )