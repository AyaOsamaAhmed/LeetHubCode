class Solution {
    public int scheduleCourse(int[][] courses) {
       Arrays.sort(courses, (a1, a2) -> {
            if(a1[1] == a2[1])
                return Integer.compare(a1[0], a2[0]); 
            return Integer.compare(a1[1], a2[1]);
        });
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int time = 0;
        
        for(int[] course : courses) {
            // if duration is greater than the completion date, then we can never slect the course
            if(course[0] > course[1]) continue;
            // if current course can be comleted with the lastday given
            if(course[0] + time <= course[1]) {
                pq.offer(course[0]);
                time += course[0];
            } else {
                if(pq.peek() > course[0]) {
                    time -= pq.poll();
                    time += course[0];
                    pq.offer(course[0]);
                }
            }
        }
        return pq.size();   
    }
}