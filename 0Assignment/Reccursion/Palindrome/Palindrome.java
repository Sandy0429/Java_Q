static boolean check_Palindrome(String str,int s, int e) 
    { 

        //enter your code here
        if (s == e) //when we have one char then 's' will be equals to 'e' hence one char is obviously palindrome
            return true;
 
        if ((str.charAt(s)) != (str.charAt(e))) //when 1st and last char are not equal hence its not palindrome
            return false;
 
        if (s < e + 1)//recursively calling function to check each and every character
            return check_Palindrome(str, s + 1, e - 1);
 
        return true;
 
    }
