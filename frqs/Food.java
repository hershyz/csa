//Part A:
//Method header:
public String getMostChildChoices(String cat1, String cat2) {

    //Initializes counter variables for each category:
    int cat1Count = 0;
    int cat2Count = 0;

    //Cycles through each food item in the menu:
    for (int i = 0; i < foodList.size(); i++) {
        
        //Creates local variable for the current food being looked at:
        Food current = foodList.get(i);

        //Increments respective counter if a food is child friendly and matches said category:
        if (current.getCategory().equals(cat1) && current.isChildFriendly()) {
            cat1Count++;
        }

        if (current.getCategory().equals(cat2) && current.isChildFriendly()) {
            cat2Count++;
        }
    }

    //Returns an empty string if both categories have 0 child friendly items:
    if (cat1Count == 0 && cat2Count == 0) {
        return "";
    }

    //Returns the first category if both categories have the same number of child friendly items (non zero):
    if (cat1Count == cat2Count) {
        return cat1;
    }

    //Returns the greater amount otherwise:
    if (cat1Count > cat2Count) {
        return cat1;
    }

    else {
        return cat2;
    }
}





//Part B:
//Method header:
public int[] categoryCounts(String[] foodCategories) {

    //Creates an integer array corresponding to the frequencies of each category in their respective positon:
    int[] counts = new int[foodCategories.length];
    for (int i = 0; i < counts.length; i++) {
        counts[i] = 0;
    }

    //Cycles through each category in the passed foodCategories[] array:
    for (int i = 0; i < foodCategories.length; i++) {

        //Increments the count array in the respective index of the current category for every matching item in the foodList:
        String currentCategory = foodCategories[i];
        for (int j = 0; i < foodList.size(); j++) {
            
            Food current = foodList.get(j);
            if (current.getCategory().equals(currentCategory)) {
                counts[i]++;
            }
        }
    }

    return counts;
}





/*
    Part C:

    This method would be written in the Menu class so that it can access the foodList.
    Since the programmer is creating a method that finds the cheapest food item, a cost field must be added to the Food class.
    The cost field in the food class would be public so that it can be accessed outside of the class. The cost field could return an integer or double value to represent a price. The cost field will not take in any parameters.
    The constructor for the food class must take in an additional parameter that initializes the cost. This paramater will be the same data type as the return type of the cost field.
    No additional changes to the Menu class would have to be made other than the addition of the method itself.
    The access modifier for the method would be public so that it can be accessed from outside the class.
    The method leastExpensiveChildFriendly() will not take any parameters.

    Method Header:
    public Food leastExpensiveChildFriendly()
*/
