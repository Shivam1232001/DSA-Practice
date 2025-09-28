public class Design_hashset {
    
        private boolean[] data;
    
        // Constructor
        public Design_hashset() {
            data = new boolean[1000001]; // allow keys 0 to 1,000,000
        }
    
        // Add key
        public void add(int key) {
            data[key] = true;
        }
    
        // Remove key
        public void remove(int key) {
            data[key] = false;
        }
    
        // Check if key exists
        public boolean contains(int key) {
            return data[key];
        }
    
        // ---------- Test ----------
        public static void main(String[] args) {
            Design_hashset set = new Design_hashset();
            set.add(1);
            set.add(2);
            System.out.println(set.contains(1)); 
            System.out.println(set.contains(3)); 
            set.add(2);
            set.remove(2);
            System.out.println(set.contains(2)); 
        }
    }
    
