import java.util.Arrays;

public class MakeTheStringGreat {
    class Stack{
        Character[] data;
        int top;
        Stack(int length){
            this.data=new Character[length];
            this.top=-1;
        }

        void push(Character input){
            data[++top]=input;
        }
        Character pop(){
            data[top]=null;
            return data[top--];
        }

        Character peek(){
            return data[top];
        }
        boolean isEmpty(){
            return top==-1;
        }
        String stackToString(){
            String res="";
            for(Character c:data){
                if(c!=null) {
                    res += c;
                }
            }
            return res;
        }
    }

    public String makeGood(String s) {
        Stack stack=new Stack(s.length());
        for(Character c:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()!=c && (stack.peek()-'A'==c-'a' || c-'A'== stack.peek()-'a')){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        return stack.stackToString();
    }

}
