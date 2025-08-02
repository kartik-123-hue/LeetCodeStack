import java.util.ArrayList;

public class MinimumStringLengthAfterRemovingSubstrings {
    class Stack{
        ArrayList<String> data;
        int top;
        Stack(){
            data=new ArrayList<>();
            top=-1;
        }
        void push(String s){
            data.add(s);
            top++;
        }
        void pop(){
            data.remove(top);
            top--;
        }
        String peek(){
            return data.get(top);
        }
        int length(){
            return data.size();
        }
    }
    public int minLength(String s) {
        Stack stack=new Stack();
        for(int i=0;i<s.length();i++){
            if(stack.length()>0 &&((stack.peek()+s.charAt(i)).equals("AB") || (stack.peek()+s.charAt(i)).equals("CD"))){
                stack.pop();
            }
            else{
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        return stack.length();
    }
}
