package ImmigerationAppointmentSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import ImmigerationAppointmentSystem.DoublyLinkedList;
import ImmigerationAppointmentSystem.person;
import ImmigerationAppointmentSystem.DoublyLinkedList.Node;


public class mymain {
	Scanner selectscan=new Scanner(System.in);
	DoublyLinkedList<person> list=new DoublyLinkedList<person> ();
	BufferedReader select =new BufferedReader(new InputStreamReader(System.in));

		            mymain() throws IOException{
		                     menu();
		            }
		 
		 
	//.................................MENU START........................................	 

		private void menu() throws IOException {
			// TODO Auto-generated method stub

			System.out.println("                     ........*****************.........");
			System.out.println("                     ........*****WELCOME*****.........");
			System.out.println("                     ........*****************.........");
			
			System.out.println("");

			System.out.println(list.size());

			System.out.println("...Select A to Add person..");
			System.out.println("...Select B to See person position by ID..");
			System.out.println("...Select C to Update person details..");
			System.out.println("...Select D to Delete person..");
			System.out.println("...Select E to Delete Last 3 persons..");
			System.out.println("...Select F to Print whole List..");
			System.out.println("...Select G to See Size of List..");
	        String option =select.readLine();
	        if(option.equals("A")){
			   addperson();
            }
	        if(option.equals("B")){
	        	System.out.println("Enter ID of Person Whose position you want to See ");
	       	    String id = select.readLine();
	       	    find(id);
            }
	        if(option.equals("C")){
	        	System.out.println("Enter ID of Person Whose position you want to Update");
	       	    String id = select.readLine();
	       	    update(id);  	
            }
	        if(option.equals("D")){
		        System.out.println("Enter ID of Person Whose position you want to DELETE");
		       	String id = select.readLine();
		        findandremove(id); 
            }
	        if(option.equals("E")){
	        	 System.out.println("Enter No ---- How many PERSONS you want to REMOVE form end");
			       Scanner no=new Scanner(System.in);
			       
			        list.removeLastno(no.nextInt()); 
            }
	        if(option.equals("F")){
	        	 System.out.println("whole list");
	        	 list.print();
			      
           }
	        if(option.equals("G")){
	        	
	        	 System.out.println("");
	        	 System.out.println("Size Of List is ---- "+list.size());
	        	 System.out.println("");
	        	
			      
          }
	        else{
	        	
	        	menu();
	        }
	      
       }
		
		//.................................MENU END........................................


       //.................................ADD METHODE......................................
		
		public void addperson() throws IOException{
			
			
			person appoint=new person();
			
			
			
	        
			
			
			
			
			System.out.println("Enter ID");
		String id =select.readLine();
			
			appoint.setId(id);
			
			System.out.println("Enter First Name");
			String fName =select.readLine();
			
			appoint.setfName(fName);
			System.out.println("");
			System.out.println("Enter Last Name");
			String lName =select.readLine();
			
			appoint.setlName(lName);
			
			System.out.println("Enter date");
			String Date =select.readLine();
			
			appoint.setDate(Date);
			
			
			System.out.println("Enter passport");
			String passport =select.readLine();
			
			appoint.setPassport(passport);
			
			System.out.println("If person has kids Enter 'Y' otherwise 'N'");
			String kids =select.readLine();
			
			if(kids.equals("N")){
				
				
				list.addLast(appoint);
	        	System.out.println("you successfully added in queue from last");
	        	menu();
			}
			if(kids.equals("Y")){
				
				System.out.println("what is age of kid?");
				double age=selectscan.nextDouble();
				if(age<1){
					
					list.addFirst(appoint);
		        	
		        	System.out.println("you successfully added person at 1st position");
		        	menu();
				}
				if(age>=1){
					
					System.out.println("Enter Position No where you want to add this person");
					
					Scanner br=new Scanner(System.in);
					
					int no=br.nextInt();
					if(no<list.size()){
					list.addSpecificPosition(appoint, no);
		        	System.out.println("you successfully added person at "+no+ " postion");
		        	
		        	menu();
					}else{
						
						list.addLast(appoint);
						System.out.println("your selected position cannot be allocated to this person as position no less than size so this is given last position");
					menu();
					}
					
		        	
		        
					
				}
				
				
			}
			
			
			else{
				
				menu();
			}

			
			
			
			
			
		}
		
		
		
	   //.................................END ADD METHODE..................................


		
//......................................FIND PERSON POSITION BY ID........
		public void find(String id){
			  
		
			System.out.println("Your Entered ID---"+id);
				
		
			Node tmp = list.header.getNext();
			for(int i=1; i<list.size()+1; i++){
  
				  if(((person) tmp.element).getId().equals(id)){
					  System.out.println("");
					  System.out.println("");
				   System.out.println("The Position Of this Person is ----  ="+i);
				   System.out.println("");
				   System.out.println("");
				   
		           System.out.println("ID          ="+((person) tmp.element).getId());
		           System.out.println("First Name  ="+((person) tmp.element).getfName());
		           System.out.println("Last Name   ="+((person) tmp.element).getlName());
		           System.out.println("Date        ="+((person) tmp.element).getDate());
		           System.out.println("Passport#   ="+((person) tmp.element).getPassport());
		       
		       break;
		       
				  }
       	
		       tmp=tmp.next;
			}
			
			  }
		
		//.............END METHODE OF FIND PERSON POSITION BY ID...............		
		
		//.............START METHODE OF UPDATE PERSON POSITION BY ID...............	
		
		public void update(String id) throws IOException{

			System.out.println("YOUR ENTERED ID---"+id);
			System.out.println("");
			System.out.println("");

			Node tmp = list.header.getNext();
			for(int i=1; i<list.size()+1; i++){
			   		  
			   if(((person) tmp.element).getId().equals(id)){ 
		       System.out.println("ID MATCHED"+((person) tmp.element).getId()); 
		       System.out.println("");
		       System.out.println("");
		       System.out.println("Enter First Name");
		       
		       String fname=select.readLine();
		       System.out.println("Enter last Name");
		       String lname=select.readLine();
		       System.out.println("Enter Date");
		       String date=select.readLine();
		       System.out.println("Enter Passport");
		       String pasport=select.readLine();
		       
		       ((person) tmp.element).setfName(fname);
		       ((person) tmp.element).setlName(lname);
		       ((person) tmp.element).setDate(date);
		       ((person) tmp.element).setPassport(pasport);
		       
		       break;
			   }
			  
				  
      	
		       tmp=tmp.next;
			}}
			  
		         

		
		
		//.............END METHODE OF UPDATE PERSON POSITION BY ID...............	
		


//........................Methode to find by ID and then remove that person...........
		public void findandremove(String id){

			System.out.println("YOUR ENTERED ID---"+id);

			Node tmp = list.header.getNext();
			for(int i=1; i<list.size()+1; i++){
		     
				  
				  
				  
				  if(((person) tmp.element).getId().equals(id)){
		            
		           
		       list.remove(tmp);
		       System.out.println("PERSON WITH ID "+((person) tmp.element).getId()+" HAS DELETED");
		       break;
		       
				  }
	       	
		       tmp=tmp.next;
			}
			
			  }
		

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
	  new mymain();
		}





}
