import com.sun.org.apache.xpath.internal.operations.Bool;

public class BaseBasicVar {

    // primitive type
    private boolean varPriBoolean;
    private byte varPriByte;
    private short varPriShort;
    private int varPriInt;
    private float varPriFloat;
    private long varPriLong;
    private double varPriDouble;
    private char varPriChar;

    // reference type
    private  Boolean varRefBoolean;
    private  Byte varRefByte;
    private Short varRefShort;
    private Integer varRefInt;
    private Float varRefFloat;
    private Long varRefLong;
    private Double varRefDouble;
    private Character varRefChar;

    // primitive  class type
    private  Class<Boolean> classPriBoolen = boolean.class;
    private  Class<Byte> classPriByte = byte.class;
    private  Class<Short> classPriShort = short.class;
    private  Class<Integer> classPriInt = int.class;
    private  Class<Float> classPriFloat = float.class;
    private  Class<Long> classPriLong = long.class;
    private  Class<Double> classPriDouble = double.class;
    private  Class<Character> classPriChar = char.class;

    // refer class type
    private  Class<Boolean> classRefBoolen = Boolean.class;
    private  Class<Byte> classRefByte = Byte.class;
    private  Class<Short> classRefShort = Short.class;
    private  Class<Integer> classRefInt = Integer.class;
    private  Class<Float> classRefFloat = Float.class;
    private  Class<Long> classRefLong = Long.class;
    private  Class<Double> classRefDouble = Double.class;
    private  Class<Character> classRefChar = Character.class;


    public static  void  main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<BaseBasicVar> bbv = BaseBasicVar.class;
        BaseBasicVar var =  bbv.newInstance();
        var.

        System.out.println(var instanceof  BaseBasicVar);




    }
}
