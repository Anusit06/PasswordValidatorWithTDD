package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: "+pw+ " Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED:"+pw+ " Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านเป็น ตัวเล็กทั้งหมดและมีตัวเลข ควรจะเป็นWeak
        pw = "kart1234";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: "+ pw + " lower and digit  password is Weak."); 
        }else{
            System.out.println("Test Case 2 FAILED:"+ pw + " Expected INVALID but got " + result2);
        }
         // Test Case 3: รหัสผ่านเป็น ตัวใหญ่และเล็กและมีตัวเลข ควรจะเป็นMedium
        pw = "Kart1234";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: "+ pw + " Upper lower and  digit  password is MEDIUM."); 
        }else{
            System.out.println("Test Case 3 FAILED:"+ pw + " Expected INVALID but got " + result3);
        }
           // Test Case 4: รหัสผ่านเป็น ตัวใหญ่ทั้งหมดและมีตัวเลขและมีตัวอักษรพิเศษ ควรจะเป็น Strong
        pw = "Kart1234@";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: "+ pw + " Upper lower digit and special is STRONG."); 
        }else{
            System.out.println("Test Case 4 FAILED: "+ pw + " Expected  " + result4);
        }
         // Test Case 5: รหัสผ่านเป็น ตัวเล็กทั้งหมด ควรจะเป็นWeak
        pw = "Kart2548";
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.WEAK) {
            System.out.println("Test Case 5 Passed: "+ pw + " lower and digit  password is Weak."); 
        }else{
            System.out.println("Test Case 5 FAILED:"+ pw + " Expected INVALID but got " + result5);
        }
         // Test Case 6: รหัสผ่านเป็น ตัวใหญ่ทังหมด ควรจะเป็นWeak
           pw = "Kart2548";
        PasswordStrength result6 = PasswordValidator.validate(pw);
        if (result6 == PasswordStrength.WEAK) {
            System.out.println("Test Case 6 Passed: "+ pw + " lower and digit  password is Weak."); 
        }else{
            System.out.println("Test Case 6 FAILED:"+ pw + " Expected INVALID but got " + result6);
        }



        System.out.println("--------------------------------");
    }
}
