class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<positions.length; i++){
            list.add(i);
        }
        list.sort((a,b)-> Integer.compare(positions[a], positions[b]));

        Stack<Integer> stack =new Stack<>();
        for(int i:list){
            if(directions.charAt(i)=='R'){
                stack.push(i);
            }else{
                while(!stack.isEmpty() && healths[i]>0){
                    if(healths[i]>healths[stack.peek()]){
                        healths[i]-=1;
                        healths[stack.peek()]=0;
                        stack.pop();
                    }else if(healths[i]<healths[stack.peek()]){
                        healths[i]=0;
                        healths[stack.peek()]-=1;
                    }else if(healths[i]==healths[stack.peek()]){
                        healths[i]=0;
                        healths[stack.peek()]=0;
                        stack.pop();
                    }
                }
            }
        }

        List<Integer> result=new ArrayList<>();
        for(int health:healths){
            if(health>0) result.add(health);
        }
        return result;
    }
}