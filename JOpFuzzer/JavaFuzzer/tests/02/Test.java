// Generated by Java* Fuzzer test generator (1.0.001). Mon Apr 10 13:03:47 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=155L;
    public static byte byFld=-6;
    public static volatile float fFld=-58.1011F;
    public static short sFld=18292;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 12);
    }

    public static long lMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2) {

        int i3=-1, i4=5, i5=-7, i6=-247, iArr[]=new int[N];
        double d1=-2.19436;

        FuzzerUtils.init(iArr, -58069);

        i2 *= (int)0L;
        Test.fFld += Test.fFld;
        Test.instanceCount = -20142;
        Test.sFld = (short)-3142079867385442006L;
        iArr[(-8 >>> 1) % N] |= i2;
        for (i3 = 9; i3 < 297; i3++) {
            for (i5 = 1; i5 < 6; ++i5) {
                Test.instanceCount -= (long)d1;
                i2 = 2;
                i4 = i6;
                if (false) {
                    i4 += (((i5 * i2) + i4) - i3);
                } else if (Test.bFld) {
                    i4 = -64902;
                    Test.instanceCount *= 70;
                }
                if (i6 != 0) {
                }
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static short sMeth(boolean b) {

        int i1=0, i7=-6, i8=-7, i9=46, i10=-239, i11=185;
        double d=0.33752;

        i1 = i1;
        b = (((Test.instanceCount + Test.byFld) - (-(d++))) >= iMeth(i1));
        i7 = 127;
        do {
            i1 &= (int)Test.instanceCount;
            Test.iArrFld[i7] *= i7;
            i1 *= i1;
            i1 = i1;
            Test.fFld *= i1;
            for (i8 = 1; i8 < 12; i8++) {
                for (i10 = 1; i10 < 2; i10++) {
                    i11 >>= i9;
                    Test.instanceCount *= i11;
                    if (i10 != 0) {
                    }
                    d += i9;
                    Test.instanceCount >>>= i8;
                }
            }
        } while (--i7 > 0);
        long meth_res = (b ? 1 : 0) + i1 + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + i11;
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static long lMeth(float f, int i) {

        int i12=-95, i13=-57;
        double d2=117.102399;

        i = i;
        i = (int)Test.instanceCount;
        Test.instanceCount = (i + Test.instanceCount);
        i -= (sMeth(false) * i);
        for (i12 = 6; i12 < 312; ++i12) {
            Test.instanceCount = (long)d2;
        }
        long meth_res = Float.floatToIntBits(f) + i + i12 + i13 + Double.doubleToLongBits(d2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i14=10;

        lMeth(61.152F, i14);

        FuzzerUtils.out.println("i14 = " + i14);

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.fFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.sFld Test.bFld Test.iArrFld = " + Test.sFld + "," + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  sMeth ->  sMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth sMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}