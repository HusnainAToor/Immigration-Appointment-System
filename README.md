# Immigration-Appointment-System
Built my own doubly linked list to create Immigration appointment system.

DATA STRUCTURE & ALOGRTHEM
Husnain A Toor

Immigration Appointment System


MENU

...Select A to Add person.
...Select B to see person position by ID.
...Select C to update person details.
...Select D to delete person.
...Select E to Delete Last 3 persons.
...Select F to print whole List.
...Select G to See Size of List.

MAIN CLASS “myMain”.
menu();

This is menu method which contain all methods from start to end addperson();
This method along with some sub methods to add person find(String);
This method finds position of person by ID update(String)
This method update the detail of person by selecting ID findandremove(String)
This method find person by and then remove that.
 
 
addFirst(E)

CLASS “DoublyLinkedList”

This method add person in first position of DoublyLinkedList

addLast(E)

This method add person in last position of DoublyLinkedList

removeFirst()

This method remove person in first position of DoublyLinkedList

removeLast()

This method remove person in last position of DoublyLinkedList

print()

This method print all persons of DoublyLinkedList with their details

removeLastno(int)

This method remove “ Nth” number persons from last of DoublyLinkedList

update(String)

This method update detils of person selected by id addSpecificPosition(E, int)
This method add person at selected position between list

removeSpecific(int)

This method delete person selected by ID in list

addBetween(E, Node<E>, Node<E>)

This method create new node between two given nodes and add element to that node in list
 
remove(Node<E>)

This method remove node from list
