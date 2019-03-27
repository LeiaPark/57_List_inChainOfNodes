/**
 Test list features.
 */

public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

         System.out.println( "number of elements: " + list.size() );
        
         // the spec requests that toString include the size
         System.out.println( "empty list: " + list
                           + System.lineSeparator());

         /* Populate the list with elements.
            Create the test data in an array, for the programming
            convenience of being able to loop through it.
         */
         String[] elements = new String[]{"y","u","t","S",};
             /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
                for convenient way to init an array of Strings */
         int elemIndex;
         for( String elem : elements ) {
             list.addAsHead( elem);
             System.out.println( "number of elements: " + list.size() );
         }
         System.out.println( "populated list: " + list
                           + System.lineSeparator());
         
         System.out.println( "Testing Newly Added Methods" + System.lineSeparator());
         
         list.set(0,"B");
         System.out.println(list + System.lineSeparator());
         
         list.set(2,5);
         System.out.println(list + System.lineSeparator());
         
         list.set(3,"test");
         System.out.println(list + System.lineSeparator());
         
         System.out.println(list.get(0) + System.lineSeparator());
         
         System.out.println(list.get(2) + System.lineSeparator());
         
         System.out.println(list.get(3) + System.lineSeparator());
         
         list.add(0, "beginning");
         System.out.println(list + System.lineSeparator());
         
         list.add(2, "middle");
         System.out.println(list + System.lineSeparator());
         
         list.add(6, "end");
         System.out.println(list + System.lineSeparator());
         
         list.remove(0);
         System.out.println(list + System.lineSeparator());
         
         list.remove(2);
         System.out.println(list + System.lineSeparator());
         
         list.remove(4);
         System.out.println(list + System.lineSeparator());
    }
}
