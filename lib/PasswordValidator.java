package lib;

public class PasswordValidator {

    /**
      ตรวจสอบความปลอดภัยของรหัสว่ามีความปลอดภัยแค่ไหน
      @param password String ที่ต้องการตรวจสอบ
      @return PasswordStrength INVAID อื่่นๆ
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
    
        
        
        
        int minLength = 8; // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        
        if (password == null || password.length() < 8) {
            return PasswordStrength.INVALID;
            
        }
        boolean digit = false;
        boolean upper = false;
        boolean lower = false;
        boolean special = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower = true;
            }else if (Character.isUpperCase(c)) {
                upper = true;
                
            }else if (Character.isDigit(c)) {
                digit = true;
            }else if (!Character.isUpperCase(c) && !Character.isLowerCase(c) && !Character.isDigit(c)){
                
                special = true;
            }
                
                
            
        }
         if (lower && !upper && !digit && !special) return PasswordStrength.WEAK;
         if (!lower &&upper && !digit && !special) return PasswordStrength.WEAK;
        if (lower && !upper && digit && !special) return PasswordStrength.WEAK;
        if (lower && upper && digit  && !special) return PasswordStrength.MEDIUM;
        if (lower && upper && digit && special ) return  PasswordStrength.STRONG;
            
        
        
        return  PasswordStrength.INVALID; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}