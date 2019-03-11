/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // fields
	private int [] refArray;
	private int filledElements = 0;  
	private static final int INITIAL_CAPACITY = 10;
	
	/**
      Construct an empty list with a small initial capacity.
     */
	 
    public List_inArraySlots() {
		refArray = int [INITIAL_CAPACITY];
    }


    /** 
      @return the number of elements in this list
     */
		public int size() {
			return filledElements;
     }


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
	  
		public String toString() {
			String RepofList = "[";
			for (int i = 0; i < filledElements; i++) {
				RepofList += refArray[i] + ",";
			}
			return RepofList + "]";
     }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
      public boolean add( int value) {
         // expand if necessary
         if( filledElements == elements.length) 
	 expand();
         refArray[ filledElements] = value;
         filledElements++;
        return true;
}


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
      private void expand() {
         System.out.println( "expand... (for debugging)");
         int[] oldArray = refArray;
	     refArray = new int[oldArray.length * 2];

        for (int i = 0; i < oldArray.length; i++) {
            refArray[i] = oldArray[i];
        }
      }
	    public int get( int index ) {
        return refArray[index];
    }

    /**
    Store et value at @index to @newValue
    @return old value at @index
    @precondition: @index is within the bounds of this list.
    */
    public int set( int index, int newValue ) {
        // store old value in local variable to return later
        int oldValue = refArray[index];

        // assign new value
        refArray[index] = newValue;

        return oldValue;
    }
    
    
    /**
      Remove the element at position @index in this list.
      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).
      @return the value that was removed from the list
     */
     public int remove( int index) {
        int removed = refArray[index];

        for( ; index < filledElements; index++){
            // set the element to the value of the element to the left
            refArray[index] = refArray[index + 1];
        }
        
        // update number of elements
        filledElements--;
        
        return removed;
     }


    /**
    Insert @value at position @index in this list.
    Shift the element currently at that position (if any)
    and any subsequent elements to the right
    (that is, increase the index associated with each).
    */
    public void add( int index, int value) {

        // keep track of element being moved and element that will be replaced
        int elemReplaced = 0;
        int elemShifting = refArray[index];
        
        //expand if necessary
        if (filledElements + 1 > refArray.length) expand();
              
        // set the new value to given index
        refArray[index] = value;   

        // update filledElements 
        filledElements++;

        // shift the rest of the elements by...
        for ( ++index; index < filledElements; index++){
            //  keep track of the element that will be replaced
            elemReplaced = refArray[index];

            // now replace with the element you were shifting
            refArray[index] = elemShifting;

            //update the element you are elemShifting
            elemShifting = elemReplaced;
        }
        
        
    }
}
