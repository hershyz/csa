//Part A:
public static String changeKey(String letter, String key) {

    //Returns the original letter if the letter does not appear in the key:
    if (!key.contains(letter)) {
        return letter;
    }

    //Returns the key without the letter, assuming that all the characters in the key are unique:
    return key.replace(letter, "");
}




/*
    Part B:
    A new private 'int counter' variable must be added to the Puzzle class.
    This counter variable will be set as zero when the class is initialized.
    A new 'public int getCount()' accessor method will be added to the Puzzle class, returning the quantity of the counter variable.
    The variable itself will be private to not allow external modification from another class.
    The accessor method will be a public returning function so that the counter value can be accessed safely externally.
*/
