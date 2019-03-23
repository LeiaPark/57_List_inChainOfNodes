/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes() {
    	/**
    	 * headReference is equal to null
    	 */
    }
     

    /**
      @return the number of elements in this list
     */
     public int size() {
    	 int result = 0;
    	 Node temp = headReference;
    	 while (temp != null) {
    		 result++;
    		 temp = temp.getReferenceToNextNode();
    	 }
    	 return result;
     }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
     public String toString() {
    	 String result = size() + " elements [";
    	 Node temp = headReference;
    	 while (temp != null) {
    		 result += temp.getcargoReference().toString() + ",";
    		 temp = temp.getReferenceToNextNode();
    	 }
    	 return result + "]";
     }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
    	 headReference = new Node(val, headReference);
    	 return true;
     }
}