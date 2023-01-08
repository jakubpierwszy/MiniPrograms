public class Stack {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        System.out.println(stack.displayMaxSize());
        System.out.println(stack.isEmpty());
        System.out.println(stack.displayStackSize());
        stack.push(3);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(8);
        stack.push(7);
        System.out.println(stack.displayStackSize());
        System.out.println("Stack:");
        stack.displayStack();
        System.out.println();
        stack.reverseStack();
        System.out.println();
        System.out.println("Stack:");
        stack.displayStack();

    }

    double[] tab;
    int first;

    public Stack(int max) {
        tab = new double[max];
        this.first = 0;
    }

    public int displayMaxSize() {
        return tab.length;
    }

    boolean isEmpty() {
        return first < 1;
    }

    public int displayStackSize() {
        return first;
    }

    public void push(double E) throws ArrayIndexOutOfBoundsException{
        if (first < tab.length) {
            tab[first] = E;
            first++;
        } else new ArrayIndexOutOfBoundsException("Stack overflow");
    }

    public double pop() throws IndexOutOfBoundsException{
        if(first>1) {
            double res = tab[first - 1];
            first--;
            return res;
        }else throw new IndexOutOfBoundsException("Stack is empty");
    }

    public void displayStack() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        } else {
            for (int i = first-1; i > 0; i--) {
                System.out.println(tab[i]);
            }
        }
    }

    public void popValue(int value){
        if(isEmpty()){
           throw new NullPointerException("Stack is empty");
        }else if (value<first){
            double res = tab[first-value];
            first-=value;
            System.out.println(res);
        }else System.out.println("Stack is smaller than "+ value);
    }

    public void cleanStack(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Stack is empty");
        }else {
            for(int i=first;i>0;i--){
                tab[i] = 0;
            }
        }
    }

    public void reverseStack(){
        double[] tabBuffor = new double[first];
        for(int i=0;i<first;i++){
            tabBuffor[i]=tab[first-i];
        }
        for(int i=0;i<tabBuffor.length;i++){
            tab[i]=tabBuffor[i];
        }
    }


}
