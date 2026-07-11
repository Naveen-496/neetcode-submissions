class MinStack {

    private ArrayList<Integer> arr;

    public MinStack() {
        this.arr = new ArrayList<>();
    }
    
    public void push(int val) {
        arr.add(val);
    }
    
    public void pop() {
        arr.removeLast();
    }
    
    public int top() {
        int last = arr.get(arr.size() - 1);
        return last;
    }
    
    public int getMin() {
        var newList = new ArrayList<>(this.arr);
        Collections.sort(newList);
        return newList.get(0);
    }
}
