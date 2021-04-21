
package mainfunction;

public class MainFunction {

    public static void main(String[] args) {
       
             LinkList list = new LinkList();
		for(int i = 0;i<10;i++)
		{
			list.createList(i);//Linked list initialization
		}
		list.add();
		list.modify();
		list.delete();
		list.insert();
    }
    
}

