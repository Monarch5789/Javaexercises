public class TestingLab {
    public static void main(String[] args) throws Exception {
        StringAnalyzer wa = new StringAnalyzer();

        System.out.println("Testing firstRepeatedCharacter method");
        String s = "aardvark";
        char result = wa.firstRepeatedCharacter(s);
        System.out.println("Test 1 firstRepeatedCharacter: " + validate('a', result));

        s = "roommate";
        result = wa.firstRepeatedCharacter(s);
        System.out.println("Test 2 firstRepeatedCharacter: " + validate('o', result));

        s = "mate";
        result = wa.firstRepeatedCharacter(s);
        System.out.println("Test 3 firstRepeatedCharacter: " + validate('0', result));
        System.out.println("----------------------");

        s = "dogs";
        result = wa.firstMultipleCharacter(s);
        System.out.println("Test 1 firstMultipleCharacter: " + validate('0', result));

        s = "ddogs";
        result = wa.firstMultipleCharacter(s);
        System.out.println("Test 2 firstMultipleCharacter: " + validate('d', result));

        s = "doogs";
        result = wa.firstMultipleCharacter(s);
        System.out.println("Test 3 firstMultipleCharacter: " + validate('o', result));

        s = "dogss";
        result = wa.firstMultipleCharacter(s);
        System.out.println("Test 4 firstMultipleCharacter: " + validate('s', result));

        System.out.println("----------------------");

        s = "mississippiii";
        int intResult = wa.countRepeatedCharacters(s);
        System.out.println("Test 1 countRepeatedCharacters: " + validate(4, intResult));

        s = "test";
        intResult = wa.countRepeatedCharacters(s);
        System.out.println("Test 2 countRepeatedCharacters: " + validate(0, intResult));

        s = "aabbcdaaaabbb";
        intResult = wa.countRepeatedCharacters(s);
        System.out.println("Test 3 countRepeatedCharacters: " + validate(4, intResult));

        System.out.println("----------------------");


    }
    private static String validate(char expected, char result){
        if(result != expected){
            return("The result " + result + " does not match expected: " + expected + " --->> Failed");
        }
        else
        {
            return("The result " + result + " match expected: " + expected + " --->> OK");
        }
    }
    private static String validate(int expected, int result){
        if(result != expected){
            return("The result " + result + " does not match expected: " + expected + " --->> Failed");
        }
        else{
            return("The result " + result + " match expected: " + expected + " --->> OK");
        }
    }
}
