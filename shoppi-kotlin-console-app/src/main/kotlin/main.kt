fun main(){

    println("안녕하세요, Shoppi 에 오신 것을 환영합니다 !")
    println("계속 하시려면 이름을 입력해주세요 :)")

    // fun readLine():String?
    val name = readLine()
    println("""
        반갑습니다 $name 님
        원하시는 카테고리를 입력해주세요
        ***============================***
    """.trimIndent())

    val cateList = arrayOf("패션", "전자기기", "반려동물용품")
    for(category in cateList){
        println(category)
    }
    println("장바구니로 이동하시려면 #을 입력하세요")

    var selectedCategory = readLine()
    while(selectedCategory.isNullOrBlank()){
        println("값을 입력해주세요")
        selectedCategory = readLine()
    }
    if(selectedCategory == "#"){
        // TODO 1. 장바구니 이동
    } else if( selectedCategory == ""){

    }

}