import java.util.Arrays;

public class TestMyList {
    public static void main(String[] args) {
        //constructor
        MyList<Integer> myList = new MyList<Integer>(9);

        //add values
        myList.add(1);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);

        //display size myList
        System.out.print("Size of myList: " + myList.size() + "\n");

        //display values
        System.out.print("myList: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "\t");
        }
        System.out.println();

        //remove value
        myList.remove(1);
        System.out.print("myList after remove values at 1st index: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "\t");
        }
        System.out.println();

        //Clone myList
        System.out.println("myList after clone: "+myList.clone());

        //contains myList
        System.out.print("5 = " + myList.contains(5) + "\n");

        //indexOf myList
        System.out.print("Number 6 in " + myList.indexOf(6) + " position" + "\n");

        //void add myList
        myList.add(7, 15);
        System.out.print("myList after a values: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "\t");
        }
        System.out.println();

        //get myList
        System.out.print("Get value at 4th index: " + myList.get(4) + "\n");

        //ensureCapacity myList
        myList.ensureCapacity(11);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.print("Size of myList: " + myList.size() + "\n");

        //clear myList
        myList.clear();
        System.out.print("myList after use clear method: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "\t");
        }
        System.out.println();


    }
}
