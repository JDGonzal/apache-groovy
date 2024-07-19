/*
* Primitive Data Types Demo
*/
public class DataTypes {
    public static void main(String[] args) {
        // byte:93
        // Min Value: -128
        // Max Value: 127
        byte b = 127
        println( b.class.getName() + " = " + b)
        // short:
        // Min Value: -32,768
        // Max Value: 32,767
        short s = 10000
        println( s.class.getName() + " = " + s)
        // int:
        // Min Value: -2,147,483,648 (-2^31)
        // Max Value 2,147,483,647 (2^311)
        int i = 2_147_483_647
        println( i.class.getName() + " = " + i)
        // long:
        // Min Value: -9,223,372,036,854,775,808 (2^63)
        // Max Value: 9,223,372,036,854,775,807 (2^631)
        long l = Long.MAX_VALUE
        System.out.println(l.class.getName() + " = " + l)
        // float: 32-bits IEEE floating points (single precision)
        // Min Value: 1.4E-45
        // Max Value: 3.4028235E38
        float f = 1.25F // float f = 1.25
        println( f.class.getName() + " = " + f)
        // double:64-bit IEEE floating points (double precision)
        // Min Value: 4.9E-324
        // Max Value: 1.7976931348623157E308
        double d = 1.05798202483D
        println( d.class.getName() + " = " + d)
        // char: character or unicode
        boolean bool = true
        println( bool.class.getName() + " = " + bool)
        // boolean: true or false

    }
}
