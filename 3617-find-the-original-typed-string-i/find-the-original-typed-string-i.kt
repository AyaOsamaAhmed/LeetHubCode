class Solution {
    fun possibleStringCount(word: String): Int {
        val list = HashMap<String , Int >()
          val listRepeat = HashMap<String , String >()


        var result = 1
        var history = "0"


        for (i in 0..word.length-1){
     
            if(list.getOrDefault(word[i].toString(), 0) == 0){
            
                list[word[i].toString()] = list.getOrDefault(word[i].toString(), 0) + 1
                history = word[i].toString()

            }else if (word[i].toString() == history){
                list[word[i].toString()] = list.getOrDefault(word[i].toString(), 0) + 1


            }else if (listRepeat.getOrDefault(word[i].toString(), "") != "" &&  history == word[i].toString()){
                val newChar = listRepeat.getOrDefault(word[i].toString(), "")
                

                list[newChar] = list.getOrDefault(newChar, 0) + 1
                history =word[i].toString()

            }else if (list.getOrDefault(word[i].toString(), 0) >= 1 ){
                var char = word[i].toString() + "*"
                    do{
                    if (list.getOrDefault(char, 0) >= 1 )
                            char = char + "*"
                    }while(list.getOrDefault(char, 0) >= 1 )

                listRepeat[word[i].toString()] = char     // last char
                 list[char] = list.getOrDefault(char, 0) + 1
                history = word[i].toString()
            }
            else 
                history = "0"
        }

        print("$list")

        for (v in list.values) {
             
            if (v > 1 ) {
                result += v - 1 
            }
        }
 

        return result
    }
}