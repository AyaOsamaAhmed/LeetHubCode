class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var result = 1
 

        for(x in accounts.indices){ 
            var customer = 0
              for(i in accounts[x].indices){
                customer += accounts[x][i]
            } 
            if(result < customer)
                result = customer 
        }

        return result 
    }
}