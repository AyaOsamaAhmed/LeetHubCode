class Solution {
    fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {
        
         fun swap(i:Int, j:Int) { people[i]=people[j].also {people[j]=people[i]}}
        // 7,0 4,4 7,1 5,0 6,1 5,2
        // 7,0 7,1 6,1 5,0 5,2 4,4
        // 7,0 6,1 7,1 5,0 5,2 4,4
        // 5,0 7,0 6,1 7,1 5,2 4,4
        // 5,0 7,0 5,2 6,1 4,4 7,1 
        Arrays.sort(people, Comparator { a,b -> if (a[0]==b[0]) a[1]-b[1] else b[0]-a[0]})
        for (i in 1..people.lastIndex) {
            val p1 = people[i]
            for (j in i downTo 1) {
                val p2 = people[j]
                if (p2[1] < j) swap(j, j-1)
                else break
            }
        }
        return people
        
    }
}