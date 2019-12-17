package com.example.retrofit

class People {
    var id:Int=0
    var body: String? = null
    var title: String? = null
    var userId: Int = 0

    constructor(id: Int, body: String?, title: String?, userId: Int) {
        this.id = id
        this.body = body
        this.title = title
        this.userId = userId
    }

    constructor()

}
