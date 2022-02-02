package data

// 싱글턴 객체
// 프로젝트 전역에서 값이 일정해야함
object CartItems{

    private val mutableProducts = mutableMapOf<Product, Int>() // mutable
    val products:Map<Product, Int> = mutableProducts // immutable (read only)

    fun addProduct(product: Product){
        mutableProducts[product]?.let {
            mutableProducts[product] = it + 1
        } ?: kotlin.run {
            mutableProducts[product] = 1
        }
    }

}




