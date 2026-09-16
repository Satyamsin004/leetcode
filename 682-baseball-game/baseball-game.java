class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack();
        int sum = 0;
        int n = operations.length;
        for(int i = 0;i<n;i++){
            if(operations[i].equals("C")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(operations[i].equals("D")){
                    if(!st.isEmpty()){
                        st.push(st.peek()*2);
                    }
                }else if(operations[i].equals("+")){
                        if(st.size() >= 2){
                            st.push(st.peek() + st.get(st.size()-2));
                        }
                    }else{
                        st.push(Integer.parseInt(operations[i]));
                    }
                }
                 for(int i = 0;i < st.size(); i++){
            sum += st.get(i);
                }
                return sum;
    }
}