// Generated by Java* Fuzzer test generator (1.0.001). Mon Apr 10 13:03:48 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8L;
    public static short sFld=-4894;
    public static byte byFld=82;
    public static double dFld=-86.103524;
    public boolean bFld=false;
    public short sFld1=25404;
    public float fFld=2.245F;

    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i3=-9, i4=-77, i5=9, i6=36, i7=65149, i8=-121;
        boolean b=false;
        float f1=122.949F;

        for (i3 = 15; i3 < 302; i3 += 2) {
            if (false) continue;
            i4 = 12;
            for (i5 = 1; i5 < 11; i5 += 3) {
                for (i7 = i5; i7 < 4; ++i7) {
                    Test.instanceCount = Test.instanceCount;
                    i6 |= i6;
                    if (b) {
                        i8 = i7;
                    } else {
                        i8 = (int)f1;
                        i8 |= i3;
                        i4 >>= i4;
                    }
                    if (i3 != 0) {
                        vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + (b ? 1 : 0) + Float.floatToIntBits(f1);
                        return;
                    }
                    Test.sFld >>>= (short)Test.instanceCount;
                    i4 = i6;
                }
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + (b ? 1 : 0) + Float.floatToIntBits(f1);
    }

    public static long lMeth(int i1, double d) {

        int i2=99;
        float f=0.141F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 25.121189);

        i2 = 210;
        do {
            switch ((i2 % 3) + 38) {
            case 38:
                Test.instanceCount = i2;
                Test.instanceCount -= (long)f;
                i1 = i2;
                break;
            case 39:
                f = i2;
                dArr[(i1 >>> 1) % N] *= f;
                i1 += (((i2 * i1) + i1) - i1);
                break;
            case 40:
                vMeth();
                switch (((i2 % 2) * 5) + 89) {
                case 98:
                    i1 -= -15666;
                    i1 = (int)f;
                case 93:
                    f += (i2 * i2);
                    i1 = (int)-3579178537710986875L;
                    i1 = i1;
                    break;
                }
                break;
            default:
                Test.byFld = (byte)f;
            }
        } while ((i2 -= 3) > 0);
        long meth_res = i1 + Double.doubleToLongBits(d) + i2 + Float.floatToIntBits(f) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vSmallMeth() {

        int i=19895, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 60243);

        i = (int)(iArr[(i >>> 1) % N] - lMeth(i, Test.dFld));
        vSmallMeth_check_sum += i + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i9=50105, i10=-10, i11=89, i12=-15, i13=41167, i14=-43858, i15=160, i16=26, i17=15, i18=27448, iArr1[]=new
            int[N];
        long l=2967L;
        boolean bArr[]=new boolean[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, 9115);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(byArr, (byte)77);

        for (int smallinvoc=0; smallinvoc<135; smallinvoc++) vSmallMeth();
        for (i9 = 9; i9 < 223; ++i9) {
            i10 += (5 + (i9 * i9));
            iArr1[i9 + 1] >>= -198;
            Test.instanceCount <<= Test.sFld;
            Test.dFld -= -52685;
            i10 += (((i9 * Test.sFld) + i11) - Test.instanceCount);
        }
        for (i12 = 19; 360 > i12; ++i12) {
            for (i14 = 4; i14 < 74; ++i14) {
                iArr1[i14 - 1] = (int)Test.dFld;
                for (l = 2; l > 1; --l) {
                    bArr[(int)(l - 1)] = bFld;
                    sFld1 = (short)-55991;
                    Test.instanceCount >>= i11;
                    i16 -= i11;
                    i10 = i10;
                    i16 *= 59258;
                    switch (((i14 % 2) * 5) + 118) {
                    case 126:
                    case 128:
                        i16 += (int)(l + Test.byFld);
                        break;
                    default:
                        bFld = bFld;
                        Test.instanceCount -= i12;
                        i11 = i10;
                    }
                }
                i15 -= (int)l;
                for (i17 = 1; i17 < 2; i17++) {
                    byArr[i17] = (byte)-247;
                    i10 += (i17 - i12);
                }
                if (true) break;
                i16 += (i14 * Test.instanceCount);
                i10 = (int)fFld;
                try {
                    iArr1[i12 - 1] = (193 % i14);
                    i16 = (i9 / -34355);
                    iArr1[i12 - 1] = (i11 / 23);
                } catch (ArithmeticException a_e) {}
            }
        }

        FuzzerUtils.out.println("i9 i10 i11 = " + i9 + "," + i10 + "," + i11);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 l i16 = " + i15 + "," + l + "," + i16);
        FuzzerUtils.out.println("i17 i18 iArr1 = " + i17 + "," + i18 + "," + FuzzerUtils.checkSum(iArr1));
        FuzzerUtils.out.println("bArr byArr = " + FuzzerUtils.checkSum(bArr) + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.dFld bFld sFld1 = " + Double.doubleToLongBits(Test.dFld) + "," + (bFld ? 1 : 0) +
            "," + sFld1);
        FuzzerUtils.out.println("fFld = " + Float.floatToIntBits(fFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth lMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
