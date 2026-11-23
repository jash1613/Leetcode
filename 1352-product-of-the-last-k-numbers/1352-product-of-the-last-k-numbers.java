class ProductOfNumbers {
     List<Integer> l;
    public ProductOfNumbers() {
        l=new ArrayList<>();
    }
    
    public void add(int num) {
        l.add(num);
    }
    
    public int getProduct(int k) {
        int temp=1;
         int index = l.size() - 1;

        while(k>0)
        {
            temp=temp*l.get(index);
             index--;
            k--;
        }
        return temp;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */