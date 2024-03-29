package screen

import extensions.getNotEmptyString

class ShoppingCategory {

    fun showCategories() {
        val cateList = arrayOf("패션", "전자기기", "반려동물용품")
        for (category in cateList) {
            println(category)
        }
        println("장바구니로 이동하시려면 #을 입력하세요")

        var selectedCategory = readLine().getNotEmptyString()
        if (selectedCategory == "#") {
            val shoppingCart = ShoppingCart()
            shoppingCart.showCartItems()
        } else {
            if(cateList.contains(selectedCategory)){
                // contains : 매개변수가 존재유무로 true/false return
                val shoppingProductList = ShoppingProductList()
                shoppingProductList.showProducts(selectedCategory)
            }else{
                showErrorMessage(selectedCategory)
            }
        }
    }

    private fun showErrorMessage(selectedCategory: String?) {
        println("[$selectedCategory] : 존재하지 않는 카테고리 입니다. 다시 입력해주세요")
        showCategories()
    }

}