class CodingChallenges {
    /*
        Challenge #1 - getFizzBuzz

        Initially, we check if i % 3 is equal to 0. If it is, we can then check if i % 5 == 0, if so, we know
        that i will result in FizzBuzz, otherwise will result in Fizz.

        If i % 3 is not true, we therefore know that i % 3 && i % 5 will never equate to true,
        so we can omit it from the i % 5 else-if block further down the tree.

        If neither expression is true, we can return the iterator.
     */
    def getFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 === 0) {
                if (i % 5 === 0) {
                    println("FizzBuzz")
                } else {
                    println("Fizz")
                }
            } else if (i % 5 === 0) {
                println("Buzz");
            } else {
                println(i)
            }
        }
    }

    /*
        Alternative approach using ternary operators. More concise, but less readable.
        Functionality is the same as getFizzBuzz.
     */
    def getFizzBuzzAlt() {
        for (int i = 1; i <= 100; i++) {
            def result = i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : i % 5 == 0 ? "Buzz" : i
            println(result)
        }
    }

    /*
        Challenge #2 - getSum

        We return a early if numbers are equal. If they are not, we can
        designate a range using the .. operator and call .sum() on the resulting array.
     */

    int getSum(int a, int b) {
        return a == b ? a : (a..b).sum()
    }

    /*
        Challenge #3 - getAccumulation

        We iterate through the provided string to begin with.
        Next, we grab the currently active character and repeat it depending on it's accumulation.
        Then, we call .capitalize() to make the character string sentence-case.
        And join the resulting array with the specified seperator.
     */

    String getAccumulation(String text) {
        def result = [];
        for (int i = 0; i < text.length(); i++) {
            String currentChar = text.charAt(i)
            String charString = currentChar.repeat(i + 1).capitalize()
            result.add(charString)
        }
        return result.join("-")
    }

    /*
        Challenge #4 - getDuplicateCount

        We begin by creating a Map so we can keep track of what letters have occured and the occurancies,
        visually:
        {
            a: 2,
            b: 4
        }
        We then iterate through the provided String, creating a new map entry for the character
        if it doesn't exist - if it does, we add 1 to the value for that key, as it has occured twice.
        Following that, we grab each entry and filter out the results that have a value higher than 1 -
        As they have repeated, and then we count how many satisfy that criteria.
        This gives us the amount of characters that have repeated for a given string.
     */

    int getDuplicateCount(String text) {
        String newText = text.toLowerCase()
        def count = [:]
        for (int i = 0; i < newText.length(); i++) {
            def currentChar = newText[i];
            if (count[currentChar]) {
                count[currentChar] += 1
            } else {
                count[currentChar] = 1
            }
        }
        return count.entrySet().stream().filter(map -> map.getValue() > 1).count()
    }

}
