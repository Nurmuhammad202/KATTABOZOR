package uz.toza.domain.model

data class Offer(
    val attributes: List<AttributeModel>,
    val brand: String,
    val category: String,
    val id: Int,
    val image: String,
    val merchant: String,
    val name: String
)