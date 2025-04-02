
//Main class to simulate the customer service queue system
public class FixSinglyLinkedOrderedList
{
	// Test the Singly Linked List
		public static void main(String[] args)
		{


			SinglyLinkedListFix list = new SinglyLinkedListFix();
			list.insertNode(4);
			list.printList();
			list.insertNode(2);
			list.printList();
			list.insertNode(1);
			list.printList();
			list.insertNode(3);

			list.printList();
			list.deleteNode(0);
			list.deleteNode(3);
			list.printList();


		}
	}


	class NodeFix {
	    int data;
	    NodeFix next;

	    public NodeFix(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class SinglyLinkedListFix {
		NodeFix head;

	    // BUGGY insertNode method
	    public void insertNode(int number) {
	    	NodeFix newNode = new NodeFix(number);
	    	NodeFix current = head;
	    	NodeFix previous = null;

	        while (current != null && current.data < number) {
	            previous = current;
	            current = current.next;
	        }
	        
	        if (previous == null) {
	            newNode.next = head;
	            head = newNode;
	        } else {
	            previous.next = newNode;
	            newNode.next = current;//Fixed: made the newNode.next = current, to not lose the current value

	        }
	    }

	    // BUGGY deleteNode method
	    public void deleteNode(int number) {
	    	NodeFix current = head;
	    	NodeFix previous = null;

	        while (current != null && current.data != number) { // Bug #3: Incorrect loop termination(Fix: Check if current != null and not next)
	            previous = current;
	            current = current.next;
	        }
	        // Fix: Check if the node to be deleted was found
	        if (current == null) {
	            return; // Number not found, do nothing
	        }

	        if (previous == null) {
	            head = current.next;
	        } else {
	            previous.next = current.next; // Bug #5: Should be previous.next = current.next(Fix)
	        }
	    }

	    public void printList() {
	    	NodeFix current = head;
	        while (current != null) {
	            System.out.print(current.data + " → ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	}

