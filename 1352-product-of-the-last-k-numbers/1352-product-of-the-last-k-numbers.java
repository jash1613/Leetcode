class ProductOfNumbers {
    List<Integer> l;
    public ProductOfNumbers() {
        l=new ArrayList<>();
        l.add(1);
    }
    
    public void add(int num) {
        if(num==0)
        {
            l=new ArrayList<>();
            l.add(1);
        }
        else
        {
            l.add(l.get(l.size()-1)*num);
        }
    }
    
    public int getProduct(int k) {
        if(l.size()<=k)
        {
            return 0;
        }
        return l.get(l.size()-1)/l.get(l.size()-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */