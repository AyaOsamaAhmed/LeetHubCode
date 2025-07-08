class Solution {
    fun clearDigits(s: String): String {
        var lastChar = ""
        var lastCharIndex = 0
        var result = s 
    do{
        for(i in 0..result.length-1){
 
            if(result[i].isDigit()){ 
               result =  result.replaceFirst(result[i].toString() , "")
               result = result.removeRange(lastCharIndex , lastCharIndex+1)
               
                break
            }else{
                lastChar = result[i].toString() 
                lastCharIndex = i
            }
        } 

        print(result)
    }while (result.contains(Regex("\\d")) )


        return result
    }
}