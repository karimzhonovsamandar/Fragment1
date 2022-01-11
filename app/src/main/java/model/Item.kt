package model

class Item {
    var image=0
    var name=""

    constructor(image: Int, name: String) {
        this.image = image
        this.name = name
    }

    constructor(image: Int) {
        this.image = image
    }

    override fun toString(): String {
        return "item(image=$image, name='$name')"
    }
}