package com.company;

public class FermatFactorization {
    static boolean isPerfectSquare(long x)
    {
        double a = Math.sqrt(x);
        double b = Math.floor(a);
        return a-b == 0;
    }

    static void factors(long t)
    {
        long m = 0l;
        long n = 0l;
        if(isPerfectSquare(t))
        {
            System.out.println("The factors are "+(long)Math.sqrt(t)+" and "+(long)Math.sqrt(t));
        } else {
            m = (long) Math.sqrt(t) + 1;
            n = (long) (Math.pow(m, 2) - t);
            while (!isPerfectSquare(n))
            {
                m++;
                n = (long) (Math.pow(m, 2) - t);
            }
        }
        long x = (long) Math.sqrt(n);
        System.out.println("The factors of "+t+" are "+(m-x)+" and "+(m+x));
    }

    public static void main(String[] args) {
        factors(340663L);
    }
    }
