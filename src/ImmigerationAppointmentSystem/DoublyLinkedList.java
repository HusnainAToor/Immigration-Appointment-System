package ImmigerationAppointmentSystem;



public class DoublyLinkedList<E> {

	  //---------------- nested Node class ----------------
	  /**
	   * Node of a doubly linked list, which stores a reference to its
	   * element and to both the previous and next node in the list.
	   */
	  static class Node<E> {

	    /** The element stored at this node */
	    E element;               // reference to the element stored at this node

	    /** A reference to the preceding node in the list */
	    private Node<E> prev;            // reference to the previous node in the list

	    /** A reference to the subsequent node in the list */
	    Node<E> next;            // reference to the subsequent node in the list

	   
	    public Node(E e, Node<E> p, Node<E> n) {
	      element = e;
	      prev = p;
	      next = n;
	    }

	   
	    public E getElement() { return element; }

	  
	    public Node<E> getPrev() { return prev; }

	 
	    public Node<E> getNext() { return next; }

	  
	    public void setPrev(Node<E> p) { prev = p; }

	   
	    public void setNext(Node<E> n) { next = n; }
	  } //----------- end of nested Node class -----------

	  // instance variables of the DoublyLinkedList
	 
	  Node<E> header;                    // header sentinel

	  private Node<E> trailer;                   // trailer sentinel

	  
	  private int size = 0;                      // number of elements in the list


	  public DoublyLinkedList() {
	    header = new Node<>(null, null, null);      // create header
	    trailer = new Node<>(null, header, null);   // trailer is preceded by header
	    header.setNext(trailer);                    // header is followed by trailer
	  }

	
	  public int size() { return size; }

	
	  public boolean isEmpty() { return size == 0; }

	
	  public E first() {
	    if (isEmpty()) return null;
	    return header.getNext().getElement();   // first element is beyond header
	  }

	
	  public E last() {
	    if (isEmpty()) return null;
	    return trailer.getPrev().getElement();    // last element is before trailer
	  }

	  
	  public void addFirst(E e) {
	    addBetween(e, header, header.getNext());    // place just after the header
	  }

	  
	  public void addLast(E e) {
	    addBetween(e, trailer.getPrev(), trailer);  // place just before the trailer
	  }

	  
	  public E removeFirst() {
	    if (isEmpty()) return null;                  // nothing to remove
	    return remove(header.getNext());             // first element is beyond header
	  }

	   
	  public E removeLast() {
	    if (isEmpty()) return null;                  // nothing to remove
	    return remove(trailer.getPrev());            // last element is before trailer
	  }

	  // private update methods
	  
	  public void print(){
		
		    Node tmp2 = header.getNext();
		    for(int i=0; i<size(); i++){
		        System.out.println("ID         =   "+((person) tmp2.element).getId());
		        System.out.println("FIRST NAME =   "+""+((person) tmp2.element).getfName());
		        System.out.println("LAST NAME  =   "+""+((person) tmp2.element).getlName());
		        System.out.println("DATE       =   "+""+((person) tmp2.element).getDate());
		        System.out.println("PASSPORT   =   "+""+((person) tmp2.element).getPassport());
		        tmp2 = tmp2.next;
		    }
	  }
	  
	  
	  
	  
	  
	  //........................REMOVE LAST MORE THAN 1 PERSONS FROM LAST
	  public void removeLastno(int no) {
		  
  	  
		    
		  for(int i=1; i<no+1; i++){
		     remove(trailer.getPrev()); 
		    
		    }// last element is before trailer
		  }
	  
	  //.......................................................
	  
	  //........................find........remove.....
	  
	  

	 
	
	
	
	public void update(String id){
		
		
		System.out.println("my id"+id);
			
		print();
		
		
		
		Node tmp = header.getNext();
		for(int i=1; i<size+1; i++){
	     
			  System.out.println("ID SEARCHED     "+((person) tmp.element).getId());
			  
			  
			  if(((person) tmp.element).getId().equals(id)){
	            
	           System.out.println("ID MATCHED"+((person) tmp.element).getId());
	       remove(tmp);
	       
	       break;
	       
			  }
	       
	       
	           
	            	
	            	
	            	
	       tmp=tmp.next;
		}
		
		
		
		
	}
	
	   	   

	  

	  
	  
	  
	  //  ................Methode to add person at specific position......
	  
	  
	  
	  
	  public void addSpecificPosition(E e, int no){
	         
	        System.out.println("......ADD BETWEEN.....");
	        Node tmp = header.getNext();
	        for(int i=1; i<size(); i++){
	            
	           
	            
	       if(i==no-1){
	    	   
	    	   addBetween(e, tmp, tmp.getNext());
	       } else{
	    	   tmp = tmp.next;
	    	   
	       }    
	            
	            
	        }
	    }
	  
	 
//.................................REMOVE SPECIFIC >......................
	  
	  
	
	  
	  
	  
	  public void removeSpecific(int id) {
		  
  	  
		  
			 
	        Node tmp = header.getNext();
	        for(int i=1; i<size(); i++){
	            
	           
	            
	       if(i==id){
	    	   
	    	  remove(tmp);
	       } else{
	    	   tmp = tmp.getNext();
	    	   
	       }    
	            
	            
	        }
		  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	  private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
	    // create and link a new node
	    Node<E> newest = new Node<>(e, predecessor, successor);
	    predecessor.setNext(newest);
	    successor.setPrev(newest);
	    size++;
	  }

	  
	  E remove(Node<E> node) {
	    Node<E> predecessor = node.getPrev();
	    Node<E> successor = node.getNext();
	    predecessor.setNext(successor);
	    successor.setPrev(predecessor);
	    size--;
	    return node.getElement();
	  }
	  
	  

	 
	 
	} //----------- end of DoublyLinkedList class -----------

