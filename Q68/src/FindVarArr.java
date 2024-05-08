public class FindVarArr {
    public static void main(String[] args) {
        // TODO Declare the variables.
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // [x] -> The first array of numbers.
        int[] arr2 = new int[10]; // [x] -> The second array of numbers.
        int selectedValue = 0; // [x] -> The selected value in the first array to search for in the second array.
        boolean found = false; // [x] -> A boolean condition representing if the number was found or not.

        // TODO Print the values of the 
        System.out.println("values in arr2: ");

        // TODO Set the values of arr2 (from 1 to 100).
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random() * 10 + 1);
            System.out.print(arr2[i] + " "); 	
        }
          	
        // TODO Getting selectedValue from the first array.
        selectedValue = arr1[(int)(Math.random() * arr1.length)];

        System.out.println("\nsearching " + selectedValue);
          	
        // TODO Searching for the selected value in the second array.
        int i;

        for (i = 0; i < arr2.length; i++) {
            if (selectedValue == arr2[i]) {
                found = true;
                break;
            }
        }
                 	
          	
        
        // TODO Displaying in what index the value was found (or not found).
        if (found) {
            System.out.println("found in index: " + i);
        } else {
            System.out.println("not found");
        }       	 	   	
   	}
}
