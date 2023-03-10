class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visited=new HashSet<>();

        visited.add(0) ;

        Stack<Integer> stack=new Stack<>();
        stack.add(0);
        while(!stack.isEmpty()){
            List<Integer> keys=rooms.get(stack.pop());
            for(int key:keys){
                if(!visited.contains(key)){
                    stack.add(key);
                    visited.add(key);
                }
            }
        }
        return rooms.size()==visited.size();
    }
}
