package constructors

import java.time.LocalDateTime

class Post(
    val name:String,
    val author: String,
    val date: LocalDateTime
){

    var body: String = "";
    var category: String ="";

    constructor(
        name: String,
        author: String,
        date: LocalDateTime,
        content: String,
        category: String
    ): this(name,author,date){
        this.body = content
        this.category = category
    }

    fun publish():String{
        return """
            Post Name:$name
            Author: $author
            Date: $date
            ${getContent(body,"Content")}
            ${getContent(category,"Category")}
        """.trimIndent();
    }

    private  fun getContent(text: String, title: String=""):String{
      return   if(text.isNotBlank() && text.isNotEmpty()){
             """
                $title: $text
                """.trimIndent()
        } else ""
    }
}