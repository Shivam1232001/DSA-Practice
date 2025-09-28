//https://leetcode.com/problems/design-hashmap/
public class Design_hashmap {
    private int[] data;
    public Design_hashmap() {
        data = new int[1000001];

        for(int i=0;i<data.length;i++){
            data[i]=-1;
        }
    }
    
    public void put(int key, int value) {
        data[key]=value;
    }
    
    public int get(int key) {
        return data[key];
    }
    
    public void remove(int key) {
        data[key]=-1;
    }

    public static void main(String[] args) {
        Design_hashmap set = new Design_hashmap();
        set.put(1,5);
        set.put(2,2);
        System.out.println(set.get(1)); 
        System.out.println(set.get(3)); 
        set.put(3,4);
        set.remove(2);
        System.out.println(set.get(2)); 
    }
}
