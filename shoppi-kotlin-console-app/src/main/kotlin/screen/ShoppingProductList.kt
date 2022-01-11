package screen

import data.CartItems
import data.Product

class ShoppingProductList {

    private val products = arrayOf(
        Product("패션", "겨울 패딩"),
        Product("패션", "겨울 바지"),
        Product("전자기기", "핸드폰"),
        Product("전자기기", "블루투스 이어폰"),
        Product("전자기기", "노트북"),
        Product("반려동물용품", "건식사료"),
        Product("반려동물용품", "습식사료"),
    )

    private val categories : Map<String, List<Product>> = products.groupBy {
        it.categoryLabel
    }

    fun showProducts(selectedCategory:String){
        val categoryProducts = categories[selectedCategory]
        if(!categoryProducts.isNullOrEmpty()){
            println("""
                ***===============================***
                선택하신 [$selectedCategory] 카테고리 상품입니다.
            """.trimIndent())
            val productSize = categoryProducts.size

            // forEachIndexed : index 와 data 를 함께 얻을 수 있다
            categoryProducts.forEachIndexed{ index, product ->
                println("${index}. ${product.name}")
            }
            showCartOption(categoryProducts, selectedCategory)
        } else {
            showEmptyProductMessage(selectedCategory)
        }

    }

    private fun showCartOption(categoryProducts: List<Product>, selectedCategory: String) {
        println(
            """
                ***===============================***
                장바구니에 담을 상품 번호를 선택해주세요
            """.trimIndent()
        )

        val selectedIndex = readLine()?.toIntOrNull()!!

        // 존재하는지 유무 판단 -> 존재하면 let
        categoryProducts.getOrNull(selectedIndex)?.let { product ->
            CartItems.addProduct(product)
            println("=> 장바구니로 이동하시려면 #을, 계속 쇼핑하시려면 *을 입력하세요.")
            val answer = readLine()
            if(answer == "#"){
                val shoppingCart = ShoppingCart()
                shoppingCart.showCartItems()
            } else if(answer == "*"){
                showProducts(selectedCategory)
            } else{
                // TODO 그 외 값 처리
            }
        }
    }

    private fun showEmptyProductMessage(selectedCategory: String) {
        println("[$selectedCategory] 카테고리의 상품이 등록되기 전입니다")
    }

}