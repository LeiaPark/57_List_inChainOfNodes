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
     
     public Node loopMethod( int index) {
    		Node temp;
    		int count;
    		for ( temp = headReference, count = 0;
    				count < index;
    				temp = temp.getReferenceToNextNode(), count++
    				) {
    		}
    		return temp;
    }
     
     public Object set( int index, Object val) {
    	 Object oldVal = null;
    	 Node newNode = loopMethod( index);
    	 oldVal = newNode.getcargoReference();
    	 newNode.setcargoReference(val);
    	 return oldVal;
     }
     
     public Object get( int index) {
    	 return loopMethod( index).getcargoReference();
     }
     
     public void add( int index, Object val) {
    	 if (index == 0) addAsHead( val);
    	 else {
    		 Node nodeBeforeNew = loopMethod( index - 1);
        	 Node newNode = new Node( val, nodeBeforeNew.getReferenceToNextNode());
        	 nodeBeforeNew.setReferenceToNextNode( newNode);
    	 }
    }

    public void remove( int index) {
    	 if (index == 0) headReference = headReference.getReferenceToNextNode();
    	 else {
    		 Node nodeBeforeRemove = loopMethod( index - 1);
    		 nodeBeforeRemove.setReferenceToNextNode( nodeBeforeRemove.getReferenceToNextNode().getReferenceToNextNode());
    	 }
    }
     
}