/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // fields
	int [] refArray;
	private int filledElements = 0;    
	
	/**
      Construct an empty list with a small initial capacity.
     */
	 
    public List_inArraySlots() {
		refArray = int [10];
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
		  if (filledElements < refArray.length) {
			  refArray[filledElements] = value;
			  filledElements ++;
			  return true;
		  }
		  else{
			  expand();
			  add(value);
			  return false;
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
}