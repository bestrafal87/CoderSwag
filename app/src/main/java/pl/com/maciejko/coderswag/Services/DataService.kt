package pl.com.maciejko.coderswag.Services

import pl.com.maciejko.coderswag.Model.Category
import pl.com.maciejko.coderswag.Model.Product

/**
 * Created by rafalmaciejko on 06.02.2018.
 */
object DataService {
    //listOf(vararg elements: T)
    val cayegory = listOf(
            // ważne jest aby wybrać kategory w odpowiedniej przestrzeni nazw
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITALGOODS", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslops Graphic beanie", "$18", "hat01"),
            Product("Devslops Hat Black", "$20", "hat02"),
            Product("Devslops Hat White", "$18", "hat03"),
            Product("Devslops Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
            Product("Devslops Hoodie Gray", "$18", "hoodie01"),
            Product("Devslops Hoodie Red", "$20", "hoodie02"),
            Product("Devslops Gray Hoodie", "$18", "hoodie03"),
            Product("Devslops Black Hoodie", "$22", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslops Shirt Gray", "$18", "shirt01"),
            Product("Devslops Shirt Red", "$20", "shirt02"),
            Product("Devslops Gray Shirt", "$18", "shirt03"),
            Product("Devslops Black Shirt", "$22", "shirt04"),
            Product("Kickflip", "$22", "shirt05")
    )
}