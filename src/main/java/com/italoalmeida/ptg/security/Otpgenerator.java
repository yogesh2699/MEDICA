package com.italoalmeida.ptg.security;

import java.io.Serializable;
import java.util.Random;

public class Otpgenerator implements Serializable {

    public static char[] OTP()
    {


        // Using numeric values
        String numbers = "0123456789";

        // Using random method
        Random rndm_method = new Random();

        char[] otp = new char[6];

        for (int i = 0; i < 6; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            otp[i] =
                    numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return otp;
    }

}
