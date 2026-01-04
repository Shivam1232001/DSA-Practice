public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==0 || strs==null)return "";

        String prefix=strs[0];

        for (int i=1;i<strs.length;i++){

            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.length()==0)return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Longest_Common_Prefix obj =new Longest_Common_Prefix();

        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix:" + obj.longestCommonPrefix(strs1) );

        String[] strs2 = {"dog", "dont", "done"};
        System.out.println("Longest common prefix:" + obj.longestCommonPrefix(strs2) );
    }
}

// DRY RUN — Test Case 1
// String[] strs1 = {"flower", "flow", "flight"};

// Step 1: Initialization
// prefix = strs[0] = "flower"

// Outer Loop (i = 1)
// strs[1] = "flow"

// While condition:
// "flow".indexOf("flower") != 0  → true (-1)


// Reduce prefix:

// prefix = "flowe"


// Check again:

// "flow".indexOf("flowe") → -1


// Reduce again:

// prefix = "flow"


// Now:

// "flow".indexOf("flow") → 0  


// Exit while loop.

// Outer Loop (i = 2)
// strs[2] = "flight"


// Check:

// "flight".indexOf("flow") → -1


// Reduce prefix:

// prefix = "flo"


// Check:

// "flight".indexOf("flo") → -1


// Reduce:

// prefix = "fl"


// Now:

// "flight".indexOf("fl") → 0 


// Exit loop.

// Final Output
// return "fl";


// Output:

// Longest common prefix: fl
