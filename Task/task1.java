public class task1 {
        public static void main(String[] args) {
        byte b = 120;      // 1 byte                // ( -128 to 127)
        short s = 10000;   // 2 bytes              //(-32,768 to 32,767)
        int i = 5;         //	4 bytes            //(-2,147,483,648 to 2,147,483,647)
        long l = 100000L;  // 8 bytes             //(-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        float f = 10;      // 4 bytes                 //(Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits)
        double d = 20.20;   //8 bytes              //(Stores fractional numbers. Sufficient for storing 15 decimal digits)
        char c = '5';        //	2 bytes         //(Stores a single character/letter or ASCII values)
        boolean bool = true;  //1 bit          //Stores true or false values

        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);
    }
}




