package controller1;



public class userController {
    public boolean isValid(String password)
    {
        char[] passChar = password.toCharArray();
        for(char encrypt:passChar)
        {
            if ((encrypt >= 97 && encrypt <= 122) || (encrypt >= 65 && encrypt <= 90) || (encrypt >= 48 || encrypt <= 57)) {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public String getEncrypted(String password)
    {
        char[] pass = password.toCharArray();char encrypt;
        for(int i = 0; i < pass.length;i++) {
            encrypt = pass[i];
            {
                if (encrypt=='z'||encrypt=='Z'||encrypt=='9') {
                    switch (encrypt) {
                        case 122:
                            pass[i]='a';
                            break;
                        case 'Z':
                            pass[i]='A';
                            break;
                        case '9':
                            pass[i]='0';
                            break;
                    }
                }
                else
                {
                    pass[i]= (char) (pass[i] + 1);
                }
            }
        }
        return new String(pass);
    }

}
