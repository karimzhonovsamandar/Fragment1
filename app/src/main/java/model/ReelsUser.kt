package model

class ReelsUser {
    var image=""

    constructor(image: String) {
        this.image = image
    }

    override fun toString(): String {
        return "ReelsUser(image='$image')"
    }
}